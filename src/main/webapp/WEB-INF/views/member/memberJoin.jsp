<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		
		<br>
		<h2>Member Join Page</h2>
		
		<form action="./memberJoin" method="post">
			<!-- ID -->
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control" id="id" name="id"
				aria-describedby="idHelp">
				<!-- ID 는 6글자 이상 -->
			</div>
			
			
			<!-- Password -->
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password" class="form-control" id="pw" name="pw">
				<!-- PW는 8글자 이상 -->
			</div>
			
			<!-- Password 확인 -->
			<div class="form-group">
				<label for="pw">Password</label> <input type="password"
					class="form-control" id="pw2" name="pw">
				<!-- PW 두개는 일치 -->	
			</div>	
			
			
			<!-- Name -->
			<div class="form-group">
				<label for="name">NAME</label> 
				<input type="text" class="form-control" id="name" name="name">
				<!-- 비어 있으면 X -->
			</div>
			
			
			<!-- Phone -->
			<div class="form-group">
				<label for="phone">PHONE</label> 
				<input type="text" class="form-control" id="phone" name="phone">
				<!-- 비어 있으면 X -->
			</div>
			
			
			<!-- Email -->
			<div class="form-group">
				<label for="email">EMAIL</label> 
				<input type="text" class="form-control" id="email" name="email">
				<!-- 비어 있으면 X -->
			</div>
			
			<button type="submit" class="btn btn-primary">Join</button>
			
		</form>

	</div>


</body>
</html>