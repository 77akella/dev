<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<html>
<head>
<title> Registration</title>
<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/CSS/login_page.css" rel="stylesheet" />
<script type="text/javascript">
  function showOrHide(cb, cat) {
    cb = document.getElementById(cb);
    cat = document.getElementById(cat);
    if (cb.checked) cat.style.display = "block";
    else cat.style.display = "none";
  }
</script>
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
				
			
			<form method="post" action="try_register.do">
				<input type="hidden" name="question" value="<%=question%>" />
					<label>Your name:</label><input type="text" name="name" class = "form"/>
					<label>Email:</label><input type="text" name="email" class = "form"/>
					<label>Please answer the question: <br/>"<%=question%>"</label><input type="text" name="answer" class = "form"/>
					<input type = 'checkbox' name="cb1" value="true" id = 'cb1' onchange = 'showOrHide("cb1", "cat1"); '/> <label>I will be provide master services</label>  <br />
  					
  					<div id = 'cat1' style = 'display: none;' ><label style="font-size: 10;">You agree to <a href="">our terms of working with clients</a>.</label></div>
					
					
				<div id ="button">
					<input type="submit" class="button" value="Register" />
				</div>
				
				<p class="center-link">
					<a href="login.do">Login</a>
				</p>
			</form>
			
			
		</div>
	</div>
</body>