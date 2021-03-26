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
		<h2>Member Login Page</h2>
		
		<form action="./memberLogin" method="post">
			<div class="form-group">
				<!-- label for의 값은 id와 동일하게 -->
				<label for="id">ID</label>
				<input type="text" class="form-control" id="id" name="id" aria-describedby="idHelp"> 
				<small id="idHelp" class="form-text text-muted">
					We'll never share your id with anyone else.
				</small>
			</div>
			
			
			<div class="form-group">
				<label for="pw">Password</label> <input
					type="password" class="form-control" id="pw" name="pw">
			</div>
			

			<button type="submit" class="btn btn-primary">Submit</button>
			
		</form>

	</div>


</body>
</html>