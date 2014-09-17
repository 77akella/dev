<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import ="org.hh.users.dto.User"%>
<%@page import ="org.hh.users.dto.Role"%>
<%@page import="org.hh.users.web.WebConstants"%>
<html>
<head>
<title>Settings</title>
<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/home-helper-web/resources/CSS/login_page.css" rel="stylesheet" />
<link href="/home-helper-web/resources/CSS/reset.css" rel="stylesheet"/>


<%
	List<String> errors = (List<String>) request.getAttribute("errors");
	User user = (User) session.getAttribute(WebConstants.SESSION_ATTR_USER);
%>

<script type="text/javascript">
  function showOrHide(cb, cat) {
    cb = document.getElementById(cb);
    cat = document.getElementById(cat);
    if (cb.checked) cat.style.display = "block";
    else cat.style.display = "none";
  }
</script>

</head>
<body class="wrapper_login">
<% 
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

	<div class="login">

		<div class="login_form">
			<div id="logo" style="float:none;">
				<a href="/home-helper-web/index.jsp"> <img
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
			
			<div style="margin-top:10px;">
			<form method="post" action="change_settings.do">
				<label>Your name:</label> 
				<input type="text" name="name" class="form" placeholder="<%=user.getName()%>"/> 
					
				<label>Your email (You will need to confirm the change of e-mail):</label> 
				<input type="text" name="email" disabled="disabled" class="form" placeholder="<%=user.getEmail()%>"/> 
				
				<%if(user.getRoles().contains(Role.CRAFTSMAN)){%>
					<input type="checkbox" checked="checked" name="master" value="true"/>  <label>I will be provide master services <br></label>
					<%}else{%><input type = 'checkbox' name="cb1" value="true" id = 'cb1' onchange = 'showOrHide("cb1", "cat1"); '/> <label>I will be provide master services</label>  <br />
  					
  					<div id = 'cat1' style = 'display: none;' ><label style="font-size: 10;">You agree to <a href="">our terms of working with clients</a>.</label></div>
				<%} %>
				<input type="checkbox" checked="checked" disabled="disabled" name="client" value="4"> <label> I am a client </label></input>

				<div id="button">
					<input type="submit" class="button" style="margin-top:10px;" value="Save" />
				</div>
			</form>
	</div>

		</div>
	</div>


</body>
</html>

