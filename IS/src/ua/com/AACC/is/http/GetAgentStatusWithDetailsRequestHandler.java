package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;

class GetAgentStatusWithDetailsRequestHandler extends AbstractXMLServlet {

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        return "<agentStatus>"
                + IS.isAgentReady(agentLoginId)
                + "</agentStatus>\n"
                + "<NotReadyAgentReasonCode>"+IS.getAgentNotReadyReasonCode(agentLoginId)+"</NotReadyAgentReasonCode>\n"
                + "<NotReadyTerminalReasonCode>"+IS.getTerminalNotReadyCode(agentLoginId)+"</NotReadyTerminalReasonCode>\n";
    }
}
