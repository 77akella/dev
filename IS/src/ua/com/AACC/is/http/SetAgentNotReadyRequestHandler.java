package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;

class SetAgentNotReadyRequestHandler extends AbstractXMLServlet{

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        IS.setAgentNotReady(agentLoginId, request.getParameter("reasonCode"));
        return "";
    }

    
    
}
