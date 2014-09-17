<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.hh.users.dto.User"%>
<%@page import="org.hh.users.web.WebConstants"%>
<%@page import="org.hh.users.dto.Role"%>
<html>
<head>
	<title> All Users</title>
	<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
	<meta charset="utf-8" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="/home-helper-web/resources/CSS/global.css" rel="stylesheet"/>
	<link href="/home-helper-web/resources/CSS/reset.css" rel="stylesheet"/>
	<link href="/home-helper-web/resources/CSS/button.css" rel="stylesheet"/>
	
	<% List <User> allUsers = (List <User>) request.getAttribute("allUsers");
	%>
	
	 <style type="text/css">
   td, th{ 
	   padding-right:80px;
	   padding-top:8px;
	   text-align:left;
	   font-family: Arial;
   	   font-size: 13px;
   }
   
   h2{
   font: 19pt sans-serif;
   }
   
   .wrapper{
   background-image: url("/home-helper-web/resources/Images/admin_bg.jpg");
   }
  
  </style>
</head>

<body>

<div class="wrapper">
<% User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);

	if(user != null && user.getRoles().contains(Role.ADMIN)) {%>
 	<div id = admin-bar>
 		<jsp:include page="/WEB-INF/jsp/hh-admin/admin-bar.jsp" />
 	</div>
 	
 	<%} %>

	
<%if(user!= null) { %>
	<header class="header">
			<jsp:include page="/resources/TemplatesPages/header_loged_users.jsp" flush="true" />
	</header><!-- .header-->

<%}%>

	
		<div class="content">
		<h2>All users in system:</h2>
			<!-- ВСТАВЛЯТЬ КОНТЕНТ В ЭТОТ БЛОК/ ENTRY CONTENT IN THIS BLOCK -->
			 
	<TABLE BORDER>
        <TR>
                <TH>Index</TH>
                <TH>Name</TH>
                <TH>Email</TH>
                <TH> Date Registration</TH>
                <TH> Role</TH>
                <TH> Status </TH>
        </TR>
       
     		  <TR>
       				<td> <%=allUsers.get(0).getId()%> </td>
					<td> <%=allUsers.get(0).getName()%> </td>
					<td> <%=allUsers.get(0).getEmail() %> </td>
					<td> <%=allUsers.get(0).getCreationDate() %> </td>
					<td> <%=allUsers.get(0).getRoles()%> </td>
					<td> <% if(allUsers.get(0).getStatus()==0) {
						%>Activate 
							<% }
					if(allUsers.get(0).getStatus() == 1) {%>
						Blocked 
						<input type="hidden" name="blocked" value="false" />
						<input type="submit" class="red" style = "margin-left:15px;" value="UNBLOCK" /> <%
					}%> 
					
					</td>
        
        </TR>
        
				<% for(int i = 1; i < allUsers.size(); i++) {
					%>
			
				 <TR>
				 <form method="GET" action="block_user.do">
				 <input type="hidden" name="email" value="<%=allUsers.get(i).getEmail()%>" />
				 
					<td> <%=allUsers.get(i).getId()%> </td>
					<td> <%=allUsers.get(i).getName()%> </td>
					<td> <%=allUsers.get(i).getEmail() %> </td>
					<td> <%=allUsers.get(i).getCreationDate() %> </td>
					<td> <%=allUsers.get(i).getRoles()%> </td>
					<td> <% if(allUsers.get(i).getStatus()==0) {
						%>
						
						<input type="hidden" name="blocked" value="true" />
						<input type="submit" class="green" style = "margin-left:-7.5px;" value="ACTIVE" />
							<% }
					
					if(allUsers.get(i).getStatus() == 1) {%>
						
						<input type="hidden" name="blocked" value="false" />
						<input type="submit" class="red" style = "margin-left:-7.5px;" value="BLOCKED" /> <%
					}%> 
					
					</td>
					
					</form>
					<%} %>	
				
						
			
       			 </TR>
       

					
				
		</TABLE>	
			
		</div><!-- .content -->

</div><!-- .wrapper -->

<footer class="footer">
	<jsp:include page="/resources/TemplatesPages/footer.jsp" flush="true"/>
</footer><!-- .footer -->

</body>
</html>