//import javax.faces.context.FacesContext;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSessionEvent;
//import javax.servlet.http.HttpSessionListener;
//
//public class SessionListener implements HttpSessionListener {
//
//    @Override
//    public void sessionCreated(HttpSessionEvent arg0) {
//
//
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        String param = request.getParameter("language");
//
//
//        IDAdminLanguage idl = (IDAdminLanguage) JSFUtils.resolve("#{languageBean}");
//
//
//        if (param != null && param.length() > 0) {
//            idl.setLanguage(param);
//        } else {
//            idl.setLanguage("de");
//        }
//    }
//
//    @Override
//    public void sessionDestroyed(HttpSessionEvent arg0) { }