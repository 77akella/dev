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

<style> 
textarea {
font-size: 100%;
padding: 0;
font-family: arial;
}

</style>
</head>
<body class="wrapper_login">




	<div class="login" style="width: 600px; padding-top:60px;">

		<div class="login_form">
			<div id="logo" style="padding-left: 135px;">
				<a href="index.jsp"> <img
					src="/home-helper-web/resources/Images/home-helper-logo.png" /></a>
			</div>


			<form method="get" action="feedback-check.do">
				<div id="errors">
					<%  if (errors != null){
						for (String error : errors) {
					    %>
					<h3 style="color: red; font: 10pt sans-serif; text-allign: center;"><%=error%></h3>
					<%
						}
					}
						 %>
				</div>
				
				<input type="text" name="from" class="form" placeholder="Email for communicate " style="width:50%; display: block; margin: 8px auto;"/> 
					<input type="text" name="name" class="form" placeholder="Your name" style="width:50%; display: block; margin: 8px auto;" />
					
					<input type="text" name="subject" class="form" placeholder="Subject" style="width:50%; display: block; margin: 8px auto;"/> 
					
					<div id="tarea">
					<textarea name="message" rows="15" cols="64" style="width: 508px; margin-left:16px; margin-bottom:20px; font:12pt sans-serif; border: 1px solid #E5E5E5;"></textarea>
					
					<label style="display:block; margin-left: 16px; ">Please answer the question: <br/>"<%=question%>"</label><input type="text" name="answer" class = "form" style="display: block; width: 250px; margin-left: 16px; float:left;"/>
					<input type="hidden" name="question" value="<%=question%>" />
				<div id="button" style="left:175px;">
					<input type="submit" class="button" value="Send" />
				</div>
				</div>
			</form>

			<div id="clear" style="clear: both;"></div>
			
			
				<p class="center-link">
					<a href="index.jsp">Back To Home Page</a>
				</p>
		</div>
	</div>


</body>
</html>

