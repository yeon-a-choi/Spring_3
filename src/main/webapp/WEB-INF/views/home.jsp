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

	<h1>Version 2</h1>

	<script type="text/javascript">
	
		let btn = document.getElementById("btn");
		let btn2 = document.getElementById("btn2");
		
		//btn2.addEventListener("click", go);
		btn2.addEventListener("click", function(){
			alert("btn2");
			go();
		});
		
		
		//btn.onclick=go;
		btn.onclick = function() {
			alert("익명함수");
			go();
		}
		
		function go() {
			alert("hello");
		}
	
	</script>

	<c:import url="./template/header.jsp"></c:import>




</body>
</html>