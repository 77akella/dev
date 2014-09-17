package vp.launchCall;

import java.net.URL;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Stub;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Interaction;


public class MakePartyToPartyCall {
    private String sessionID_returned;
    private int totalRes_returned;
    private int unusedSIP_returned;
    private int unusedH323_returned;


	private String errorMessage;
	private String appName;
	private String vpmsHost;
	private String outcallUser;
	private String outcallPassword;
        private Logger logger = LoggerFactory.getLogger("MakePartyToPartyCall");

	public MakePartyToPartyCall(String appName, String vpmsHost,
			String outcallUser, String outcallPassword) {
		this.appName = appName;
		this.vpmsHost = vpmsHost;
		this.outcallUser = outcallUser;
		this.outcallPassword = outcallPassword;
	}

    public String getSessionID_returned() {
        return sessionID_returned;
    }

    public int getTotalRes_returned() {
        return totalRes_returned;
    }

    public int getUnusedH323_returned() {
        return unusedH323_returned;
    }

    public int getUnusedSIP_returned() {
        return unusedSIP_returned;
    }

    public String getVpmsHost() {
        return vpmsHost;
    }

	public LaunchCCXMLResponse makeCall(Interaction interaction) {

		try {
			/*
			 * get a configuration factory, need this to support digest
			 * authentication
			 */
			MyEngineConfigurationFactory configFactory = new MyEngineConfigurationFactory(
					MyEngineConfigurationFactory.AUTHENTICATION_TYPE.DIGEST);
			EngineConfiguration config = configFactory.getClientEngineConfig();

			/* locate the service */
			AppIntfWS_ServiceLocator locator = new AppIntfWS_ServiceLocator(
					config);
			AppIntfWS_PortType appintfws = locator.getAppIntfWS(new URL("http://"+vpmsHost+"/axis/services/AppIntfWS"));


			/* set parameters */
			Stub stub = (Stub) appintfws;
			stub.setTimeout(45000);// in milliseconds
			stub.setUsername(outcallUser);
			stub.setPassword(outcallPassword);

			/* we are ready to roll */
			LaunchCCXMLRequest request = new LaunchCCXMLRequest();
			request.setApplicationName(appName);

                        Long campaignId=interaction.getCampaign().getId();
                        Long contactId=interaction.getContactId();
                        Long contactListId=interaction.getContactList().getId();

//                        String humanUrl=strategy.getOutHumanScenario()==null?"null":strategy.getOutHumanScenario().getId();

                        StringBuilder parameters=new StringBuilder();
                        parameters.append(";interId=").append(interaction.getId());
                        parameters.append(";contactListId=").append(contactListId);
                        parameters.append(";contactId=").append(contactId);
                        parameters.append(";campaignId=").append(campaignId);

                        if(interaction.getAni()!=null){
                            parameters.append(";ani=").append(interaction.getAni());
                        }

                        if(interaction.getActionNode()!=null&&interaction.getActionNode().getHumanCallFlow()!=null){
                            parameters.append(";noAnsTime=").append(interaction.getActionNode().getTimeout());
                            parameters.append(";enhCCA=").append(interaction.getActionNode().isUseCCA());
                            parameters.append(";humanUrl=").append(interaction.getActionNode().getHumanCallFlow().getId());
                            parameters.append(";faxUrl=").append(
                                    interaction.getActionNode().getFaxCallFlow()!=null?interaction.getActionNode().getFaxCallFlow().getId():"null");
                            parameters.append(";machineUrl=").append(
                                    interaction.getActionNode().getMachineCallFlow()!=null?interaction.getActionNode().getMachineCallFlow().getId():"null");
                        }else{
                            return null;
                        }
                        logger.info("DNIS="+interaction.getDnis()+". Parameters = "+parameters.toString());
			request.setParameters(";dnis="
					+ interaction.getDnis() + parameters);
			request.setApplicationURL("");
            /*
             * Bug in VP requires somethign in the ToURI
             */
			request.setToURI("111");
			request.setUuiInfo("TDU IVR Manager");

			LaunchCCXMLResponse response = appintfws.launchCCXML(request);
                        this.sessionID_returned=response.getSessionID_returned();
                        this.totalRes_returned=response.getTotalRes_returned();
                        this.unusedH323_returned=response.getUnusedH323_returned();
                        this.unusedSIP_returned=response.getUnusedSIP_returned();
			logger.info("LaunchCCXML: launchCCXML succeeded"
					+ ", SessionID = " + response.getSessionID_returned()
					+ ", TotalRes = " + response.getTotalRes_returned()
					+ ", UnusedH323 = " + response.getUnusedH323_returned()
					+ ", UnusedSIP = " + response.getUnusedSIP_returned());
			return response;
		} catch (LaunchCCXMLFault e) {
                        logger.error("LaunchCCXMLFault:",e);
			this.errorMessage = e.getDescription();
			return null;
		} catch (Exception e) {
			logger.error("Exception:",e);
                        this.errorMessage = e.getMessage();
			return null;
		}
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
}
