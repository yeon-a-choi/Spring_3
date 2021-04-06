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

	<button class="b">BUTTON</button>
	<button id="btn" class="b">CILCK</button>
	<button id="btn2" class="b">CILCK2</button>

	<h1 id="t">Version 1</h1>


	<ol id="result">
		<li>A</li>
	</ol>
	
	
	<select id="mon">
	</select>


	<script type="text/javascript">
			
		$("#btn2").click(function(){
			for(let i=1; i<13; i++){
				$("#mon").append('<option>'+i+'</option>');
			}
			
			// append
			// 기존의 내용 끝에 추가. 계속 누르면 기존의 내용을 지워주지 않고 계속 끝에 추가
			
			//$("#result").prepend('<a href="#">Go</a>');
		});
		
	</script>

	<c:import url="./template/header.jsp"></c:import>




</body>
</html>