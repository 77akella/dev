<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	
	
	<link rel="stylesheet" href="/home-helper-web/resources/Slider/css/style.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
	<script src="/home-helper-web/resources/Slider/js/slides.js"></script>
	
	<script>
		$(function(){
		$("#slides").slides({
		   effect: "slide, fade"
		
		});
		$("#slides").slides("play");
		
		});
	</script>
</head>
<body>

<div id="container">
		<div id="slides">
			<img src="/home-helper-web/resources/Slider/Content/5.jpg" width="1000" height="400">
			<img src="/home-helper-web/resources/Slider/Content/6.jpg" width="1000" height="400">
			<img src="/home-helper-web/resources/Slider/Content/7.jpg" width="1000" height="400">
		</div>
</div>
</body>
</html>
