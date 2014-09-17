package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;


class BlindTransferRequestHandler extends AbstractXMLServlet {

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        String contactId = request.getParameter("contactID");
        String destAddress = request.getParameter("destAddress");
//        if (contactId == null) {
//            //Parameter validation failed
//            throw new Exception("3", new Exception("Parameter validation failed: contactId==null"));
//        }
        if (destAddress == null) {
            //Parameter validation failed
            throw new Exception("3", new Exception("Parameter validation failed: destAddress==null"));
        }
        IS.blindTransfer(agentLoginId, contactId, destAddress);
        return "";
    }
}
