<%@page import="org.hh.users.dto.User"%>
<%@page import="java.util.List"%>
<%
	List<User> allUsers = (List<User>)request.getAttribute("allUsers");
	for (User user : allUsers){
	    out.println(user.getEmail() + " " + user.getStatus());
	    out.println("<br/>");
	}
	out.print("<h1>Hello Artem!!!</h1>");
%>
