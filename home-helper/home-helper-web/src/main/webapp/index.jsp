<%@page import="org.hh.users.dto.Role"%>
<%@page import="javax.management.relation.RoleStatus"%>
<%@page import="org.hh.users.web.WebConstants"%>
<%@page import="org.hh.users.dto.User"%>
<%@page import="org.hh.users.web.UsersController"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
	<meta charset="utf-8" />
	<title> Welcome to HomeHelper!</title>
	<link href="/home-helper-web/resources/CSS/global.css" rel="stylesheet"/>
	<link href="/home-helper-web/resources/CSS/reset.css" rel="stylesheet"/>
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

<%}else {%>
	<header class="header">
			<jsp:include page="/resources/TemplatesPages/header.jsp" flush="true" />
	</header><!-- .header-->
<%} %>

	<div id="slider"> 
		<jsp:include page="/resources/Slider/slider.jsp" />
	</div>
	<main class="content">
	<h2 style="text-align: center;"> Welcome to Home Helper</h2>

	<%  ;
		if(user != null){ 
		%>
			<div>Hello <%=user.getName()%> <br/>You logged as: <%=user.getEmail()%>!</div>
			<% if (user.getRoles().contains(Role.ADMIN)) { %> <!--  Потом исправить на  -->
			<div>
				<a href="hh-admin/getAllUsers.do">SHOW ALL USERS</a>
			</div>
			<%} %>
			
			<div>
				<a href="logout.do">Log out</a>
			</div>
			
		<% } else {%>
			<div>
				<a href="login.do">Login</a>
			</div>
		<%} %>
		
		<strong>Content:
	</main><!-- .content -->

</div><!-- .wrapper -->

<footer class="footer">
	<jsp:include page="/resources/TemplatesPages/footer.jsp" flush="true"/>
</footer><!-- .footer -->

</body>
</html>
