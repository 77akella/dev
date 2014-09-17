package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;

class ControlledTransferRequestHandler extends AbstractXMLServlet {

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        String destAddress = request.getParameter("destAddress");
        String contactId = request.getParameter("contactID");
//        if (contactId == null) {
//            //Parameter validation failed
//            throw new Exception("3", new Exception("Parameter validation failed: contactId==null"));
//        }
        if (destAddress == null) {
            //Parameter validation failed
            throw new Exception("3", new Exception("Parameter validation failed: destAddress==null"));
        }
        String consultContactId = IS.initiateConsultTransfer(agentLoginId, contactId, destAddress);
        return "<consultContactID>" + consultContactId + "</consultContactID>";
    }
}
