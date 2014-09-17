<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> </title>
	<link rel="shortcut icon" href="/home-helper-web/resources/Images/home-helper-logo.png" type="image/x-icon">
	<meta charset="utf-8" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="/home-helper-web/resources/CSS/global.css" rel="stylesheet"/>
	<link href="/home-helper-web/resources/CSS/reset.css" rel="stylesheet"/>
</head>

<body>

<div class="wrapper">

	<header class="header">
			<jsp:include page="/resources/TemplatesPages/header.jsp" flush="true" />
	</header><!-- .header-->

	<div id="slider">  <!-- Чтобы убрать слайдер удалите этот блок / To remove the slider delete this block -->
		<jsp:include page="/resources/Slider/slider.jsp" />
	</div>
	
		<div class="content">
			<!-- ВСТАВЛЯТЬ КОНТЕНТ В ЭТОТ БЛОК/ ENTRY CONTENT IN THIS BLOCK -->
				<strong>Content:</strong> Sed placerat accumsan ligula. Aliquam felis magna, congue quis, tempus eu, aliquam vitae, ante. Cras neque justo, ultrices at, rhoncus a, facilisis eget, nisl. Quisque vitae pede. Nam et augue. Sed a elit. Ut vel massa. Suspendisse nibh pede, ultrices vitae, ultrices nec, mollis non, nibh. In sit amet pede quis leo vulputate hendrerit. Cras laoreet leo et justo auctor condimentum. Integer id enim. Suspendisse egestas, dui ac egestas mollis, libero orci hendrerit lacus, et malesuada lorem neque ac libero. Morbi tempor pulvinar pede. Donec vel elit.
	
		</div><!-- .content -->

</div><!-- .wrapper -->

<footer class="footer">
	<jsp:include page="/resources/TemplatesPages/footer.jsp" flush="true"/>
</footer><!-- .footer -->

</body>
</html>