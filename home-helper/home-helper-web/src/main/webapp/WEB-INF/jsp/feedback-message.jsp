<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Support</title>
<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/CSS/login_page.css" rel="stylesheet" />
<link href="/resources/CSS/reset.css" rel="stylesheet"/>
<%
	String question = (String)request.getAttribute("question");
	List<String> errors = (List<String>)request.getAttribute("errors");
%>
</head>
<body class="wrapper_login">




	<div class="login" style="width: 600px; padding-top:60px;">

		<div class="login_form">
			<div id="logo" style="padding-left: 135px;">
				<a href="index.jsp"> <img
					src="/home-helper-web/resources/Images/home-helper-logo.png" /></a>
			</div>

<p style="text-align:center; font:25pt Helveteca; color:#00304D; font-style:italic;">   YOUR MESSAGE SENDED, <br/> THANK YOU! </p>
			
				<p class="center-link">
					<a href="index.jsp">Back To Home Page</a>
				</p>
		</div>
	</div>


</body>
</html>

