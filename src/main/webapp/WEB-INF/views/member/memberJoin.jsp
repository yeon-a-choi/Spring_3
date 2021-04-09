<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="../template/bootStrap.jsp"></c:import>

<style type="text/css">

	.r1{
		color:red;
		<!-- 미만 -->
	}
	
	.r2{
		color:blue;
		<!-- 이상 -->
	}
	
</style>

</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		
		<br>
		<h2>Member Join Page</h2>
		
		<form id="frm" action="./memberJoin" method="post" enctype="multipart/form-data">
			<!-- ID -->
			<div class="form-group">
				<label for="id">ID</label> 
				<input type="text" class="form-control" id="id" name="id"
				aria-describedby="idHelp">
				<h4 id=idCheckResult></h4>
				<!-- ID 는 6글자 이상 -->
			</div>
			
			
			<!-- Password -->
			<div class="form-group">
				<label for="pw">Password</label> 
				<input type="password" class="form-control" id="pw" name="pw">
				<h4 id="pwResult"></h4>
				<!-- PW는 8글자 이상 -->
			</div>
			
			<!-- Password 확인 -->
			<div class="form-group">
				<label for="pw">Confirm Password</label> <input type="password"
					class="form-control pw2Result" id="pw2">
				<!-- 2번째 비밀번호를 입력했을 때, 같으면 아무일 X, 다르면 값을 지우기 -->
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
			
			
			<div class="form-group">
				<label for="avatar">Avatar</label> 
				<input type="file" class="form-control etc" id="avatar" name="avatar">
				<!-- 비어 있으면 X -->
			</div>
			
			<!-- 이 버튼은 submit이벤트가 내장되어있어 값을 비교하고 보내는것이 아닌 그냥 보내므로 null값이여도 보내서 exception발생시킴 -->
			<!-- <button type="submit" class="btn btn-primary" id="check">Submit</button> -->
						
			<!-- input type으로 만든 버튼은 form 내부/외부 둘 다 작동안함 -->
			<!-- <input type="button" value="JOIN" class="btn btn-primary">  -->
			
			<input type="submit" value="JOIN" id="btn" class="btn btn-primary">
			<!-- button -->
		</form>
		
	</div>
	
	<script type="text/javascript" src="../resources/js/memberJoin.js?var=2"></script>

</body>
</html>