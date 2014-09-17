package vp.launchCall;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.configuration.EngineConfigurationFactoryDefault;
import org.apache.axis.configuration.XMLStringProvider;

public class MyEngineConfigurationFactory implements EngineConfigurationFactory {
	public enum AUTHENTICATION_TYPE { NO_AUTHENTICATION, DIGEST, USERNAME_TOKEN };
	private EngineConfigurationFactory defaultFactory;
	private XMLStringProvider clientConfig;

	private String configData =
		"<deployment name=\"defaultClientConfig\""
			+ "            xmlns=\"http://xml.apache.org/axis/wsdd/\""
			+ "            xmlns:java=\"http://xml.apache.org/axis/wsdd/providers/java\">"
			+ " <transport name=\"http\" pivot=\"java:org.apache.axis.transport.http.HTTPSender\"/>"
			+ " <transport name=\"local\" pivot=\"java:org.apache.axis.transport.local.LocalSender\"/>"
			+ " <transport name=\"java\" pivot=\"java:org.apache.axis.transport.java.JavaSender\"/>"
			+ "  <globalConfiguration>"
			+ "    <requestFlow>"
			+ "    </requestFlow>"
			+ "    <responseFlow>"
			+ "    </responseFlow>"
			+ " </globalConfiguration> "
			+ "</deployment>";

	private String configDataUsernameToken =
		"<deployment name=\"defaultClientConfig\""
			+ "            xmlns=\"http://xml.apache.org/axis/wsdd/\""
			+ "            xmlns:java=\"http://xml.apache.org/axis/wsdd/providers/java\">"
			+ " <transport name=\"http\" pivot=\"java:org.apache.axis.transport.http.HTTPSender\"/>"
			+ " <transport name=\"local\" pivot=\"java:org.apache.axis.transport.local.LocalSender\"/>"
			+ " <transport name=\"java\" pivot=\"java:org.apache.axis.transport.java.JavaSender\"/>"
			+ "  <globalConfiguration>"
			+ "    <requestFlow>"
			+ "      <handler type=\"java:org.apache.ws.axis.security.WSDoAllSender\">"
			+ "      </handler>"
			+ "    </requestFlow>"
			+ "    <responseFlow>"
			+ "    </responseFlow>"
			+ " </globalConfiguration> "
			+ "</deployment>";

	private String configDataDigest =
			"<deployment name=\"commonsHTTPConfig\""
			+ "				xmlns=\"http://xml.apache.org/axis/wsdd/\" "
			+ "				xmlns:java=\"http://xml.apache.org/axis/wsdd/providers/java\"> "
			+ "<transport name=\"http\" pivot=\"java:org.apache.axis.transport.http.CommonsHTTPSender\" /> "
			+ "<transport name=\"local\" pivot = \"java:org.apache.axis.transport.local.LocalSender\" /> "
			+ "<transport name=\"java\" pivot=\"java:org.apache.axis.transport.java.JavaSender\" /> "
			+ "</deployment>";

    public static EngineConfigurationFactory newFactory(Object param) {
        if (param != null)
            return null;  // not for us.

        return new MyEngineConfigurationFactory();
    }

	public MyEngineConfigurationFactory(boolean usernameToken) {
		super();
 		defaultFactory = EngineConfigurationFactoryDefault.newFactory(null);
		clientConfig = new XMLStringProvider(usernameToken ? configDataUsernameToken : configData);
	}

	public MyEngineConfigurationFactory(AUTHENTICATION_TYPE autenticationType) {
		super();
 		defaultFactory = EngineConfigurationFactoryDefault.newFactory(null);
 		switch(autenticationType) {
 		case NO_AUTHENTICATION:
 			clientConfig = new XMLStringProvider(configData);
 			break;
 		case DIGEST:
 			clientConfig = new XMLStringProvider(configDataDigest);
 			break;
 		case USERNAME_TOKEN:
 			clientConfig = new XMLStringProvider(configDataUsernameToken);
 			break;
 		}
	}

	public MyEngineConfigurationFactory() {
		super();
 		defaultFactory = EngineConfigurationFactoryDefault.newFactory(null);
		clientConfig = new XMLStringProvider(configData);
	}


    @Override
	public EngineConfiguration getClientEngineConfig() {
		return (clientConfig);
	}

    @Override
	public EngineConfiguration getServerEngineConfig() {
		return (defaultFactory.getServerEngineConfig());
	}
}
