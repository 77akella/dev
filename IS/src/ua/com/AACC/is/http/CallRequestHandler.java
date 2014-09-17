package ua.com.AACC.is.http;

import javax.servlet.http.HttpServletRequest;
import ua.com.AACC.is.run.IS;


public class CallRequestHandler extends AbstractXMLServlet {

    @Override
    public String handleAction(String agentLoginId, HttpServletRequest request) throws Exception {
        String destAddress=request.getParameter("destAddress");
        if(destAddress==null){
            //Parameter validation failed
            throw new Exception("3", new Exception("Parameter validation failed: destAddress is null"));
        }
        String contactId=IS.originateCall(destAddress, agentLoginId);
        if(contactId==null){
            throw new Exception("13");
        }
        return "<contactID>"+contactId+"</contactID>";
    }
}
