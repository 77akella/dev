package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;

class SetAgentReadyRequestHandler extends AbstractXMLServlet {

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        IS.setAgentReady(agentLoginId);
        return "";
    }

   
    
}
