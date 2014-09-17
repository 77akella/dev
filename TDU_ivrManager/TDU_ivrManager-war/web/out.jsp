<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE ccxml PUBLIC "-//W3C//DTD CCXML 1.0//EN" "http://www.w3.org/TR/ccxml/ccxml.dtd">
<ccxml version="1.0" xmlns="http://www.w3.org/2002/09/ccxml">
<%@page import="java.util.Map"%>
<%@ page contentType="application/ccxml+xml"%>
<!--
    Created on : Feb 21, 2012, 11:53:54 AM
    Author     : artem
-->

<%
org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger("CCXML");
logger.info("Fetching CCXML from "+request.getRequestURL().toString());
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "1");


Map<String,String[]> parMap=request.getParameterMap();
for(String key:parMap.keySet()){
    for(String val:parMap.get(key)){
        logger.debug("------------"+key+" - "+val);
    }
}
%>
<!-- Variables -->

	<!-- Set the initial state -->
	<var name="state" expr="'initial'"/>
	<var name="mycon" expr="'conn1'"/>
	<var name="dialogid" expr="''"/>
        <var name="interId" expr="''"/>
	<var name="callFlowId" expr="''"/>
	<var name="campaignId" expr="''"/>
        <var name="contactListId" expr="''"/>
	<var name="contactId" expr="''"/>
	<var name="dnis" expr="''"/>
        <var name="ani" expr="''"/>
        <var name="src" expr="'ccxml'"/>
	<var name="noAnsTime" expr="'40000'"/>
	<var name="humanUrl" expr="''"/>
	<var name="machineUrl" expr="''"/>
	<var name="faxUrl" expr="''"/>
	<var name="enhCCA" expr="'true'"/>
	<var name="enhCCATimeout" expr="'5000'"/>
	<var name="MaxRecordedMsgLength" expr="'40000'"/>
	<var name="CallPacing" expr="'false'"/>
	<var name="status" expr="'success'"/>
	<var name="ComplCodeUrl" expr="'CallCode'"/>
	<var name="CompletionCode" expr="'Answer_'"/>
	<var name="ringRecdFlag" expr="'false'"/>
	<var name="recMsgStartedFlag" expr="'false'"/>
	<var name="humanDialogKilled" expr="'false'"/>
	<var name="toUpdateLiveVoice" expr="'false'"/>
	<var name="uui_enc" expr="''"/>
	<var name="compCodeFetchId" expr="''"/>
	<var name="complnTimeFetchId" expr="''"/>
	<var name="ccaTimerId" expr="''"/>
	<var name="updateRingStartTimeFetchId" expr="''"/>
	<var name="decAttemptsCountFetchId" expr="''"/>
	<var name="fetchFailureCount" expr="0"/>
	<var name="CallConnectTime" expr="0"/>
	<var name="StartOfVoiceOffset" expr="0"/>
	<var name="FirstPromptOffset" expr="0"/>
	<var name="CallCompletionTime" expr="0"/>
	<var name="AnswerTimers" expr="'true'"/>
	<var name="StartOfVoiceTimeout" expr="'2000ms'"/>
	<var name="LiveVoiceTimeout" expr="'1800ms'"/>

        <var name="gotCallCode" expr="'false'"/>

	<!-- Event processor -->
	<eventprocessor statevariable="state">
		<!-- Save all parameters passed by the Campaign Worker and launch the call -->
		<transition event="ccxml.loaded" state="initial">
			<log expr="'UUI_Info is ' + session.values.avaya.UUI_Info"/>

                        <assign name="uui_enc" expr="'00' + session.values.avaya.UUI_Info"/>
                        <assign name="interId" expr="session.values.avaya.ParameterMap.interId" />
                        <assign name="callFlowId" expr="session.values.avaya.ParameterMap.callFlowId" />
                        <assign name="campaignId" expr="session.values.avaya.ParameterMap.campaignId" />
                        <assign name="contactId" expr="session.values.avaya.ParameterMap.contactId" />
                        <assign name="contactListId" expr="session.values.avaya.ParameterMap.contactListId" />
                        <assign name="dnis" expr="session.values.avaya.ParameterMap.dnis" />
                        <assign name="ani" expr="session.values.avaya.ParameterMap.ani" />
                        <assign name="enhCCA" expr="session.values.avaya.ParameterMap.enhCCA" />
                        <assign name="noAnsTime" expr="session.values.avaya.ParameterMap.noAnsTime * 1000" />
                        <assign name="humanUrl" expr="session.values.avaya.ParameterMap.humanUrl" />
                        <assign name="machineUrl" expr="session.values.avaya.ParameterMap.machineUrl" />
                        <assign name="faxUrl" expr="session.values.avaya.ParameterMap.faxUrl" />
  			<send name="'avaya.launchresponse'" targettype="'avaya_platform'" target="'avaya.launchresponse'" namelist="status"/>
 			<dialogprepare dialogid="dialogid" src="'In?id='+humanUrl"
 					namelist="interId callFlowId campaignId contactListId contactId"
                                        parameters="interId callFlowId campaignId contactListId contactId"/>
  			<assign name="state" expr="'preparing'"/>
		</transition>
		<transition event="dialog.prepared" state="preparing">
  			<if cond="enhCCA == 'true'">
  				<createcall callerid="ani" dest="dnis" aai="interId" timeout="noAnsTime" connectionid="mycon" hints="{enable_call_classification:'true',call_classification_timeout:enhCCATimeout,call_classification_recorded_msg_timeout:MaxRecordedMsgLength,call_classification_connectWhen:'OnConnect'}"/>
  			<else/>
  				<createcall callerid="ani" dest="dnis" aai="interId" timeout="noAnsTime" connectionid="mycon"/>
  			</if>
  			<assign name="state" expr="'calling'"/>
		</transition>
		<!-- Call is answered, launch the VXML application and update the disposition -->
	    <transition event="connection.connected"  state="calling">
  	    	<log expr="'TDU_VAS - connection.connected'"/>
	        <log expr="'-- ' + event$.name +' -- [' + state +']'"/>
	        <assign name="CallConnectTime" expr="(new Date()).getTime()+''"/>
	        <if cond="enhCCA == 'false'">
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
				<dialogstart prepareddialogid="dialogid" connectionid="mycon"/>
	  			<assign name="state" expr="'connected'"/>
	  		<else />
	  			<!-- Start the 'start of voice' timer -->
	  			<assign name="state" expr="'ccawait'"/>
	  			<if cond="AnswerTimers == 'true'">
	  				<send target="session.id" sendid="ccaTimerId" name="'ccasov.timeout'" delay="StartOfVoiceTimeout" />
	  			</if>
  			</if>
	    </transition>
	    <transition event="connection.progressing" state="calling">
	    	<log expr="'TDU_VAS - connection.progressing with ' + event$.info.callprogress"/>
	    	<if cond="event$.info.callprogress == 'ringing'">
	    		<!--  Update the ring start time -->
                        <assign name="CompletionCode" expr="'ringing'"/>
	    		<assign name="ringRecdFlag" expr="'true'"/>
		        <fetch fetchid="updateRingStartTimeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
                <elseif cond="event$.connection.protocol.name == 'sip'"/>
                        <if cond="event$.info.sip.resptext == 'Ringing'">
                            <!--  Update the ring start time , same as above no or cond found -->
                            <assign name="ringRecdFlag" expr="'true'"/>
                            <assign name="CompletionCode" expr="'ringing'"/>
                            <fetch fetchid="updateRingStartTimeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
                        </if>
	    	</if>
		</transition>
		<!-- For handling results when CCA is enabled on Call Progress (default is on connect) -->
	    <transition event="connection.signal" state="calling">
	    	<if cond="event$.info.callprogress == 'busy_tone'">
	        	<assign name="CompletionCode" expr="'Call_Busy'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	<elseif cond="event$.info.callprogress == 'reorder'"/>
	        	<assign name="CompletionCode" expr="'Reorder_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	<elseif cond="event$.info.callprogress == 'sit_tone_vacant'"/>
	        	<assign name="CompletionCode" expr="'SIT_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	<elseif cond="event$.info.callprogress == 'sit_tone_reorder'"/>
	        	<assign name="CompletionCode" expr="'SIT_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	<elseif cond="event$.info.callprogress == 'sit_tone_no_circuit'"/>
	        	<assign name="CompletionCode" expr="'SIT_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	<elseif cond="event$.info.callprogress == 'sit_tone_ineffective'"/>
	        	<assign name="CompletionCode" expr="'SIT_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	<elseif cond="event$.info.callprogress == 'sit_tone_intercept'"/>
	        	<assign name="CompletionCode" expr="'SIT_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
	    	</if>
		</transition>
	    <!--  Call classification result handling -->
	    <transition event="connection.signal" state="ccawait">
	    	<log expr="'TDU_VAS - connection.signal in ccawait with ' + event$.info.callprogress"/>
	        <if cond="event$.info.callprogress == 'start_of_voice'">
       			<if cond="AnswerTimers == 'true'">
	        		<cancel sendid="ccaTimerId"/>
	        		<send target="session.id" name="'cca2s.timeout'" delay="LiveVoiceTimeout" />
	        	</if>
				<assign name="StartOfVoiceOffset" expr="event$.info.callprogresstime"/>
	        <elseif cond="event$.info.callprogress == 'live_voice'"/>
	        	<assign name="CompletionCode" expr="'Answer_Human'"/>
                        <assign name="gotCallCode" expr="'true'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
				<dialogstart prepareddialogid="dialogid" connectionid="mycon"/>
	  			<assign name="state" expr="'connected'"/>
	        <elseif cond="event$.info.callprogress == 'recorded_msg'"/>
	        	<assign name="recMsgStartedFlag" expr="'true'"/>
	        <elseif cond="event$.info.callprogress == 'msg_end'"/>
	        	<assign name="CompletionCode" expr="'Answer_Machine'"/>
                        <assign name="gotCallCode" expr="'true'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <if cond="machineUrl == 'null'">
		        	<assign name="state" expr="'connected'"/>
		        	<disconnect connectionid="mycon"/>
		        <else/>
					<dialogstart src="machineUrl" connectionid="mycon"
							namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
	  				<assign name="state" expr="'connected'"/>
				</if>
			<elseif cond="event$.info.callprogress == 'fax_answer_tone'"/>
	        	<assign name="CompletionCode" expr="'Answer_Fax'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <if cond="faxUrl == 'null'">
		        	<assign name="state" expr="'connected'"/>
		        	<disconnect connectionid="mycon"/>
		        <else/>
                                <dialogstart src="faxUrl" connectionid="mycon"
                                                namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
                                <assign name="state" expr="'connected'"/>
                        </if>
			<elseif cond="event$.info.callprogress == 'sit_tone'"/>
	        	<assign name="CompletionCode" expr="'SIT_Tone'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
			<elseif cond="event$.info.callprogress == 'reorder'"/>
	        	<if cond="ringRecdFlag == 'true'">
	        		<assign name="CompletionCode" expr="'No_Answer'"/>
                                <assign name="gotCallCode" expr="'true'"/>
	        	<else/>
	        		<assign name="CompletionCode" expr="'Reorder_Tone'"/>
                                <assign name="gotCallCode" expr="'true'"/>
	        	</if>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
		        <disconnect connectionid="mycon"/>
			<elseif cond="event$.info.callprogress == 'error'"/>
	        	<assign name="CompletionCode" expr="'Application_Error-callprogress'+event$.reason"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <assign name="state" expr="'connected'"/>
<!--		        <disconnect connectionid="mycon"/> -->
	        <elseif cond="event$.info.callprogress == 'timeout'"/>
	        	<if cond="recMsgStartedFlag == 'true'">
	        		<!-- Recorded msg was detected before timeout, so it's ans machine -->
		        	<assign name="CompletionCode" expr="'Answer_Machine'"/>
                                <assign name="gotCallCode" expr="'true'"/>
			        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
			        <if cond="machineUrl == 'null'">
			        	<assign name="state" expr="'connected'"/>
			        	<disconnect connectionid="mycon"/>
			        <else/>
						<dialogstart src="machineUrl" connectionid="mycon"
								namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani" parameters="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		  				<assign name="state" expr="'connected'"/>
					</if>
	        	<else/>
		        	<!-- Same as live voice -->
               <assign name="CompletionCode" expr="'Answer_Human'"/>
               <assign name="gotCallCode" expr="'true'"/>
			        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
					<dialogstart prepareddialogid="dialogid" connectionid="mycon"/>
		  			<assign name="state" expr="'connected'"/>
	  			</if>
	        </if>
	    </transition>
	    <transition event="cca2s.timeout" state="ccawait">
	        <log expr="'-- ' + event$.name +' -- [' + state +']'"/>
	        	<!-- SOV received, but no live_voice yet -->
	        	<assign name="CompletionCode" expr="'Answer_Human'"/>
                        <assign name="gotCallCode" expr="'true'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		     	<!--  flag to keep track of pending disp update -->
		     	<assign name="toUpdateLiveVoice" expr="'true'"/>
				<dialogstart prepareddialogid="dialogid" connectionid="mycon"/>
	  			<assign name="state" expr="'connected'"/>
	    </transition>
	    <transition event="cca2s.timeout">
	        <log expr="'--(Ignoring) ' + event$.name +' -- [' + state +']'"/>
	    </transition>
	    <transition event="ccasov.timeout" state="ccawait">
	        <log expr="'-- ' + event$.name +' -- [' + state +']'"/>
	        	<!-- Not even start of voice in first 2s -->
            <assign name="CompletionCode" expr="'Answer_Human'"/>
            <assign name="gotCallCode" expr="'true'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
				<dialogstart prepareddialogid="dialogid" connectionid="mycon"/>
	  			<assign name="state" expr="'connected'"/>
	    </transition>
	    <transition event="ccasov.timeout">
	        <log expr="'--(Ignoring) ' + event$.name +' -- [' + state +']'"/>
	    </transition>
	    <transition event="connection.signal" state="connected">
	    	<log expr="'TDU_VAS - connection.signal in connected with ' + event$.info.callprogress"/>
	    	<if cond="event$.info.callprogress == 'recorded_msg'">
	        		<assign name="recMsgStartedFlag" expr="'true'"/>
			     	<assign name="toUpdateLiveVoice" expr="'false'"/>
	        		<assign name="CompletionCode" expr="'Answer_Machine'"/>
                                <assign name="gotCallCode" expr="'true'"/>
		        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
 					<if cond="machineUrl == 'null'">
		        		<disconnect connectionid="mycon"/>
 					<else/>
 						<!-- kill the human dialog and wait for message end -->
 						<dialogterminate dialogid="dialogid" immediate="'true'"/>
						<assign name="humanDialogKilled" expr="'true'"/>
 					</if>
	        <elseif cond="event$.info.callprogress == 'msg_end'"/>
	        	<assign name="CompletionCode" expr="'Answer_Machine'"/>
                        <assign name="gotCallCode" expr="'true'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		        <if cond="machineUrl == 'null'">
		        	<disconnect connectionid="mycon"/>
		        <else/>
              <assign name="CompletionCode" expr="'Machine_msg_end'"/>
					<dialogstart src="machineUrl" connectionid="mycon"
							namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
				</if>
			<elseif cond="event$.info.callprogress == 'timeout'"/>
	        	<if cond="recMsgStartedFlag == 'true'">

		        	<assign name="CompletionCode" expr="'Answer_Machine'"/>
                                <assign name="gotCallCode" expr="'true'"/>
			        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
			        <if cond="machineUrl == 'null'">
			        	<disconnect connectionid="mycon"/>
			        <else/>
                 <assign name="CompletionCode" expr="'Answer_Machine'"/>
                 <assign name="gotCallCode" expr="'true'"/>
						<dialogstart src="machineUrl" connectionid="mycon"
								namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
					</if>
				<else/>
					<!-- App was started and it is not machine - so update as Human -->
					<if cond="toUpdateLiveVoice == 'true'">
			     		<assign name="toUpdateLiveVoice" expr="'false'"/>
						<assign name="CompletionCode" expr="'Answer_Human'"/>
                                                <assign name="gotCallCode" expr="'true'"/>
					<else/>
						<assign name="CompletionCode" expr="'Answer_'"/>
                                                <assign name="gotCallCode" expr="'true'"/>
					</if>
			        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
				</if>
			<elseif cond="event$.info.callprogress == 'fax_answer_tone'"/>
		     	<assign name="toUpdateLiveVoice" expr="'false'"/>
	        	<assign name="CompletionCode" expr="'Answer_Fax'"/>
                        <assign name="gotCallCode" expr="'true'"/>
	        	<fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
				<!-- kill the human dialog -->
				<dialogterminate dialogid="dialogid" immediate="'true'"/>
		        <if cond="faxUrl == 'null'">
		        	<disconnect connectionid="mycon"/>
		        <else/>
					<dialogstart src="faxUrl" connectionid="mycon"
							namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
		  		</if>
		  	<elseif cond="event$.info.callprogress == 'start_of_voice'"/>
		  		<assign name="StartOfVoiceOffset" expr="event$.info.callprogresstime"/>
			<elseif cond="event$.info.callprogress == 'live_voice'"/>
				<log expr="'TDU_VAS: late reception of live_voice'"/>
		     	<assign name="toUpdateLiveVoice" expr="'false'"/>
	        	<assign name="CompletionCode" expr="'Answer_Human'"/>
                        <assign name="gotCallCode" expr="'true'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani StartOfVoiceOffset"/>
			<elseif cond="event$.info.callprogress == 'first_prompt_start'"/>
				<assign name="FirstPromptOffset" expr="event$.info.callprogresstime"/>
			<else/>
                            <if cond="gotCallCode=='false'">
                                <assign name="CompletionCode" expr="'Answer_'"/>
                                <assign name="gotCallCode" expr="'true'"/>
                                <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
                            </if>
	        </if>
	    </transition>
	    <!-- Call connection failed, update the disposition -->
	    <transition event="connection.failed" state="calling">
	        <log expr="'-- ' + event$.name +' -- [' + state +']'"/>
	        <log expr="'Reason - ' + event$.reason"/>
	        <if cond="event$.reason == 'noanswer'">
                        <if cond="ringRecdFlag == 'true'">
	        		<assign name="CompletionCode" expr="'No_Answer'"/>
                                <assign name="gotCallCode" expr="'true'"/>
	        	<else/>
	        		<assign name="CompletionCode" expr="'Reorder_Tone'"/>
                                <assign name="gotCallCode" expr="'true'"/>
	        	</if>
	        <elseif cond="event$.reason == 'busy'"/>
                        <if cond="ringRecdFlag == 'true'">
	        		<assign name="CompletionCode" expr="'Cancel_No_Answer'"/>
                                <assign name="gotCallCode" expr="'true'"/>
	        	<else/>
	        		<assign name="CompletionCode" expr="'Call_Busy'"/>
                                <assign name="gotCallCode" expr="'true'"/>
	        	</if>
	        <elseif cond="event$.reason == 'noroute'"/>
	        	<assign name="CompletionCode" expr="'Invalid_Number'"/>
	        <else/>
	        	<assign name="CompletionCode" expr="'Network_Refusal'"/>
	        </if>
	        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
	        <assign name="state" expr="'exiting'"/>
	    </transition>
	    <!--  Transfer request from the application -->
	    <transition event="dialog.transfer" state="connected">
			<var name="dialog_values" expr="event$.values"/>
			<if cond="typeof(dialog_values) == 'undefined'">
			        <assign name="dialog_values" expr="new Object()"/>
			</if>
			<var name="is_transfer_audio" expr="event$.IsTransferAudio"/>
			<if cond="event$.type == 'blind'">
			        <assign name="dialog_values.ConnectWhen" expr="'OnProceeding'"/>
			        <if cond="pomInfo___VDN != 'null'">
			        	<assign name="dialog_values.AAI" expr="uui_enc"/>
					<else/>
			        	<assign name="dialog_values.AAI" expr="event$.aai"/>
			        </if>
			        <assign name="state" expr="'redirecting'"/>
			        <redirect connectionid="mycon" dest="event$.uri" hints="dialog_values"/>
			<elseif cond="event$.type == 'bridged'"/>
			        <assign name="dialog_values.ConnectWhen" expr="'OnConnected'"/>
			        <if cond="event$.maxtime">
			                <assign name="transfer_timeout" expr="event$.maxtime"/>
			        <else/>
			                <assign name="transfer_timeout" expr="0"/>
			        </if>
			        <assign name="state" expr="'calling_inbridge'"/>
			        <createcall connectionid="out_connectionid" dest="event$.uri" aai="event$.aai" callerid="in_remotenum" timeout="event$.connecttimeout" hints="dialog_values"/>
			        <if cond="!is_transfer_audio">
			                <join id1="mycon" id2="out_connectionid" dtmfclamp="false"/>
			        </if>
			<elseif cond="event$.type == 'supervised'"/>
			        <assign name="dialog_values.ConnectWhen" expr="'OnConnected'"/>
			        <assign name="dialog_values.AAI" expr="event$.aai"/>
			        <if cond="typeof(event$.connecttimeout) != 'undefined'">
			                <assign name="dialog_values.TransferTimeout" expr="event$.connecttimeout"/>
			        </if>
			        <assign name="state" expr="'redirecting'"/>
			        <redirect connectionid="mycon" dest="event$.uri" hints="dialog_values"/>
			</if>
	    </transition>
		<transition event="connection.redirected" state="redirecting">
			<log expr="'redirected'"/>
			<dialogterminate dialogid="dialogid"/>
		</transition>
		<transition event="connection.disconnected" state="connected">
			<log expr="'disconnected'"/>
			<!-- To check if the call was disconnected without updating the disposition -->
			<if cond="toUpdateLiveVoice == 'true'">
				<log expr="'Call disconnected without updating disposition'"/>
				<assign name="CompletionCode" expr="'ended'"/>
		        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
			</if>
			<dialogterminate dialogid="dialogid"/>
		</transition>
		<transition event="connection.disconnected" state="ccawait">
			<log expr="'Error : Disconnect in ccawait state'"/>
        	<assign name="CompletionCode" expr="'ended'"/>
	        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
			<dialogterminate dialogid="dialogid"/>
		</transition>
	    <!-- Done updating the disposition -->
	    <transition event="fetch.done" state="">
	        <log expr="'-- ' + event$.name +' -- [' + state +']' + ' FetchID' + event$.fetchid "/>
	        <if cond="state == 'exiting'">
				<if cond="CallPacing == 'true'">
					<!-- Decrement Attempt Count
			        <fetch fetchid="decAttemptsCountFetchId" next="ComplCodeUrl + 'DecrementAttemptsCount'" type="'text/ecmascript'"  namelist="JobID GroupID"/>-->
        			<assign name="CallPacing" expr="'false'"/>
				<else/>
		        	<log expr="'TDU_VAS exiting'"/>
		  <!--      	<var name="_avayaExitReason" expr="event$.values._avayaExitReason"/>
		   -->      <var name="_avayaExitReason" expr="'1'"/>
		        	<var name="_avayaExitInfo1" expr="'TDU_VAS'"/>
		        	<var name="_avayaExitInfo2" expr="interId"/>
		        	<exit namelist="_avayaExitReason _avayaExitInfo1 _avayaExitInfo2"/>
	        	</if>
	        </if>
	    </transition>
	    <transition event="error.fetch" >
	      	<log expr="'TDU_VAS fetch error: (' + event$.reason + ') fetchid ' + event$.fetchid"/>
	      	<if cond="compCodeFetchId == event$.fetchid">
	      		<log expr="'TDU_VAS: Fetch error in UpdateCompletionCode for ' + interId + ', fetchFailureCount '+fetchFailureCount"/>
	  			<assign name="fetchFailureCount" expr="Number(fetchFailureCount) + 1"/>
	  			<if cond="fetchFailureCount == '120'">
	  				<exit/>
	  			<else/>
<!--	      			<fetch fetchid="compCodeFetchId" next="secondaryWsurl + 'UpdateCompletionCode'" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/> -->
	      		</if>
	      	</if>
	      	<if cond="complnTimeFetchId == event$.fetchid">
	      		<log expr="'TDU_VAS: Fetch error in Update CallCompletionTime for '+ interId"/>
	  			<assign name="fetchFailureCount" expr="Number(fetchFailureCount) + 1"/>
	  			<if cond="fetchFailureCount == '120'">
	  				<exit/>
	  			<else/>
<!--	        		<fetch fetchid="complnTimeFetchId" next="ComplCodeUrl + 'UpdateCallCompletionTime'" type="'text/ecmascript'"  namelist="interId CallConnectTime StartOfVoiceOffset FirstPromptOffset CallCompletionTime"/>
-->
	        	</if>
	      	</if>
<!--	      	<if cond="decAttemptsCountFetchId == event$.fetchid">
	      		<log expr="'TDU_VAS: Fetch error in decAttemptsCount'"/>
	      		<exit/>
	      	</if>

	      	<if cond="updateRingStartTimeFetchId == event$.fetchid">
	      		<log expr="'TDU_VAS: Fetch error in updateRingStartTime'"/>
	      	</if>-->
	   <!-- <exit/>  -->
	    </transition>
		<transition event="dialog.started">
			<assign name="FirstPromptOffset" expr="(new Date()).getTime() - CallConnectTime"/>
		</transition>
	    <transition event="dialog.disconnect">
	    	<disconnect connectionid="mycon"/>
	    </transition>
		<transition event="dialog.exit">
			<!-- Release the license by updating completion time -->
			<if cond="humanDialogKilled == 'true'">
				<assign name="humanDialogKilled" expr="'false'"/>
			<else/>
				<!--  adding '' at the end converts arg to string and solves the truncation issue -->
				<assign name="CallCompletionTime" expr="(new Date()).getTime()+''"/>
		        <fetch fetchid="complnTimeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani CallConnectTime StartOfVoiceOffset FirstPromptOffset CallCompletionTime"/>
		        <assign name="state" expr="'exiting'"/>
			</if>
		</transition>
		<transition event="error.dialog.notprepared">
        	<assign name="CompletionCode" expr="'Application_Error'"/>
	        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
	        <assign name="state" expr="'exiting'"/>
		</transition>
		<transition event="error.dialog.notstarted">
        	<assign name="CompletionCode" expr="'Application_Error'"/>
	        <fetch fetchid="compCodeFetchId" next="ComplCodeUrl" type="'text/ecmascript'"  namelist="interId callFlowId campaignId contactListId contactId dnis CompletionCode ani"/>
	        <assign name="state" expr="'exiting'"/>
		</transition>
		<transition event="error.notallowed">
			<!-- Timer cancel failed ? -->
			<log expr="'TDU__Dialer error: (' + event$.reason + ')'"/>
		</transition>
	    <transition event="error.*" >
	      <log expr="'TDU__Dialer error: (' + event$.reason + ')'"/>
        	<assign name="status" expr="'failure'"/>
  			<send name="'avaya.launchresponse'" targettype="'avaya_platform'" target="'avaya.launchresponse'" namelist="status"/>
	      <exit/>
	    </transition>
	   	<transition event="ccxml.kill" >
	      <log expr="'TDU__Dialer getting killed: (' + event$.reason + ')'"/>
	      <exit/>
	    </transition>
	</eventprocessor>
</ccxml>
