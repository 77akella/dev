package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;

class CompleteControlledTransferRequestHandler extends AbstractXMLServlet{

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        String consultContactId = request.getParameter("consultContactID");
        String contactId = request.getParameter("contactID");
//        if (contactId == null) {
//            //Parameter validation failed
//            throw new Exception("3", new Exception("Parameter validation failed: contactId==null"));
//        }
        if (consultContactId == null) {
            //Parameter validation failed
            throw new Exception("3", new Exception("Parameter validation failed: consultContactID==null"));
        }
        IS.completeConsultTransfer(agentLoginId, contactId, consultContactId);
        return "";
    }

}
