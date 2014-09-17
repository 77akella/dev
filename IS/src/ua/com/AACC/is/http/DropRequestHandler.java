package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;

class DropRequestHandler extends AbstractXMLServlet {

    public DropRequestHandler() {
    }

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        String contactId = request.getParameter("contactID");
//        if (contactId == null) {
//            //Parameter validation failed
//            throw new Exception("3", new Exception("Parameter validation failed"));
//        }
        IS.dropCall(agentLoginId, contactId);
        return "";
    }
}
