<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="../template/bootStrap.jsp"></c:import>

</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h1>Member Join Check Page</h1>
		
		<!-- checkbox -->
		<div class="form-check">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input" value="">전체 동의
			</label>
		</div>
		
		<div class="form-check">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input" value="">동의
			</label>
		</div>
		
		<!-- 큰 글자 -->
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		<!-- -------------------- -->
		
		<!-- checkbox -->
		<div class="form-check">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input" value="">동의
			</label>
		</div>
		
		<!-- 큰 글자 -->
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		
		<!-- -------------------- -->
		
		
		<!-- checkbox -->
		<div class="form-check">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input" value="">동의
			</label>
		</div>
		
		<!-- 큰 글자 -->
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>
		
		
		
		<!-- -------------------- -->
		
		
		<!-- checkbox -->
		<div class="form-check">
			<label class="form-check-label"> <input type="checkbox"
				class="form-check-input" value="">동의
			</label>
		</div>
		
		<!-- 큰 글자 -->
		<div class="jumbotron">
			<h1>Bootstrap Tutorial</h1>
			<p>Bootstrap is the most popular HTML, CSS...</p>
		</div>


		<button class="btn-danger" onclick="check()">JOIN</button>
		<script type="text/javascript" src="../resources/js/memberJoinCheck.js"></script>
	
	</div>
	

</body>
</html>