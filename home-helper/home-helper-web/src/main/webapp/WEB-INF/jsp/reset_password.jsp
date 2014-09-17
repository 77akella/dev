<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<html>
<head>
<title> Reset Password</title>
<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/CSS/login_page.css" rel="stylesheet" />
</head>
<%
	String question = (String)request.getAttribute("question");
	List<String> errors = (List<String>)request.getAttribute("errors");
%>
<body class="wrapper_login">
	<div class="login">
		<div class="login_form">
		<div id="logo"> <a href="index.jsp"> <img src="/home-helper-web/resources/Images/home-helper-logo.png"/></a> </div>
			
				<div id="errors">
					<%  if (errors != null){
					for (String error : errors) {
				    %>
					<h3 style="color: red; font: 10pt sans-serif; text-allign:center;"><%=error%></h3>
					<%
					}
				}
			 %>
				</div>
				
			
			<form method="post" action="try_resetpassword.do">
				<input type="hidden" name="question" value="<%=question%>" />
					<label>Email:</label><input type="text" name="email" class = "form"/>
				
					<label>Please answer the question: <br/>"<%=question%>"</label><input type="text" name="answer" class = "form"/>
				
				<div id ="button" style="left:133px;">
					<input type="submit" class="button"  style="width:150px; margin-right:50px;" value="Reset Password" />
				</div>
				
				<p class="center-link">
					<a href="login.do">Login</a>
				</p>
			</form>
		</div>
	</div>
</body>