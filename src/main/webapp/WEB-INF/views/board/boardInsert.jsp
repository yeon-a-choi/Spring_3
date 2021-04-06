<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>${board} Insert Page</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">

		<br>
		<h2>${board} Insert Page</h2>

		<form id="form" action="./${board}Insert" method="post">
			<!-- Title -->
			<div class="form-group">
				<label for="title">Title</label> <input type="text" class="form-control myCheck"
					id="title" name="title" aria-describedby="titleHelp">
			</div>


			<!-- Writer -->
			<div class="form-group">
				<label for="writer">Writer</label> <input type="text"
					class="form-control myCheck" readonly="readonly" id="writer" name="writer" value="${member.id}">
			</div>


			<!-- Contents -->
			<div class="form-group">
				<label for="contents">Contents</label> 
				<textarea class="form-control myCheck" rows="5" name="contents" id="contents"></textarea>
			</div>
			
    		<input type="button" value="WRITE" class="btn btn-primary" id="btn">

		</form>

	</div>
	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>
	

</body>
</html>