<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="Ko">
<head>
<!-- Required meta tags(설명) -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="./template/bootStrap.jsp"></c:import>

<!-- css 연결 -->
<link rel="stylesheet" href="./resources/css/test.css">

<!-- js 연결 
<script type="text/javascript" src="./resources/js/test.js"></script>-->

<title>Home</title>

</head>
<body>

	<button onclick="go()">BUTTON</button>
	<button id="btn">CILCK</button>
	<button id="btn2">CILCK2</button>

	<h1>Version 1</h1>
	
	
	<div id="d1">
		<div id="d2"></div>
	</div>

	<script type="text/javascript">
	
		$("#btn2").click(function(){
			$.get("./test", function(data){
				console.log(data);
				$("#d2").html(data);
				
			});
		});
		
	</script>

	<c:import url="./template/header.jsp"></c:import>




</body>
</html>