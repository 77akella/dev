<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Login</title>
<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/CSS/login_page.css" rel="stylesheet" />
<link href="/resources/CSS/reset.css" rel="stylesheet"/>


<%
	List<String> errors = (List<String>) request.getAttribute("errors");
%>
</head>
<body class="wrapper_login">




	<div class="login">

		<div class="login_form">
			<div id="logo">
				<a href="index.jsp"> <img
					src="/home-helper-web/resources/Images/home-helper-logo.png" /></a>
			</div>

				<div id="errors">
				<%
					if (errors != null) {
						for (String error : errors) {
				%>
				<h3 style="color: red; font: 10pt sans-serif; text-allign: center;"><%=error%></h3>
				<%
					}
					}
				%>
			</div>
			<form method="post" action="try_login.do">

				<label>Email:</label> <input type="text" name="email" class="form"
					placeholder="Email" /> <label>Password:</label> <input
					type="password" name="password" class="form" placeholder="Password" />

				<div id="button">
					<input type="submit" class="button" value="Login" />
				</div>
			</form>

			<p class="center-link">
				<a href="reset_password.do">Forgot password? You are idiot!</a>
			</p>
			<p class="center-link">
				<a href="register.do">New here? Register!</a>
			</p>

		</div>
	</div>


</body>
</html>

