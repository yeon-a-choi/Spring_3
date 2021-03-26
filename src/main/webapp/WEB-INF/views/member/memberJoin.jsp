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
				
				<small id="idHelp" class="form-text text-muted">
					We'll never share your id with anyone else.
				</small>
			</div>
			
			
			<!-- Password -->
			<div class="form-group">
				<label for="pw">Password</label> <input
					type="password" class="form-control" id="pw" name="pw">
			</div>
			
			
			<!-- Name -->
			<div class="form-group">
				<label for="name">NAME</label> 
				<input type="text" class="form-control" id="name" name="name">
			</div>
			
			
			<!-- Phone -->
			<div class="form-group">
				<label for="phone">PHONE</label> 
				<input type="text" class="form-control" id="phone" name="phone">
			</div>
			
			
			<!-- Email -->
			<div class="form-group">
				<label for="email">EMAIL</label> 
				<input type="text" class="form-control" id="email" name="email">
			</div>
			
			<button type="submit" class="btn btn-primary">Join</button>
			
		</form>

	</div>


</body>
</html>