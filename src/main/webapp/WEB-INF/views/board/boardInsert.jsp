<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>${board} Insert Page</title>

<style>

	#sample{
		display: none;
	}

</style>

</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<h2>${board}form</h2>
		<form id="frm" action="./${board}Insert" method="post">
			
			<!-- Writer -->
			<div class="form-group">
				<label for="writer">Writer:</label> <input type="text"
					readonly="readonly" value="${member.id}"
					class="form-control myCheck" id="writer" name="writer">
			</div>
			
			<!-- Title -->
			<div class="form-group">
				<label for="title">Title:</label> <input type="text"
					class="form-control myCheck" id="title" name="title">
			</div>

			<!-- Contents -->
			<div class="form-group">
				<label for="contents">Contents:</label>
				<textarea class="form-control myCheck" rows="5" id="contents"
					name="contents"></textarea>
			</div>
			
			<!-- button -->
			<input type="button" id="add" value="ADD" class="btn btn-danger">
			<input type="button" id="del" value="DELETE" class="btn btn-info">
			
			<!-- sample files add -->
			<div id="files"></div>

			<input type="button" id="btn" value="WRITE" class="btn btn-primary">
		</form>
	</div>
	
	<!-- add files && delete files -->
	<div id="sample">
		<div class="input-group">
			<div class="custom-file">
				<input type="file" class="custom-file-input" id="inputGroupFile04"
					aria-describedby="inputGroupFileAddon04"> <label
					class="custom-file-label" for="inputGroupFile04">Choose
					file</label>
			</div>
			<div class="input-group-append delete">
				<input class="btn btn-outline-secondary" type="button"
					id="inputGroupFileAddon04" value="Delete">
			</div>
		</div>


	</div>

	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>
	<script type="text/javascript" src="../resources/jquery/fileAdd.js"></script>
	
</body>
</html>