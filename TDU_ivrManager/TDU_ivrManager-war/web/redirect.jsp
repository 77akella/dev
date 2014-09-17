<%@page import="javax.faces.context.FacesContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    try{
        ((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).invalidate();
    }catch(Exception e){
    }
//    FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    System.out.println("redirection to login");
%>
<c:redirect  url="/login.xhtml" />
