<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>${board} Update Page</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">

		<br>
		<h2>${board} Update Page</h2>

		<form id="form" action="./${board}Update" method="post">
			
			<input type="hidden" name="num" value="${param.num}">
			
			<!-- Title -->
			<div class="form-group">
				<label for="title">Title</label> <input type="text" class="form-control"
					id="title" name="title" value="${dto.title}" aria-describedby="titleHelp">
			</div>


			<!-- Writer -->
			<div class="form-group">
				<label for="writer">Writer</label> <input type="text"
					class="form-control" readonly="readonly" id="writer" name="writer" value="${dto.writer}">
			</div>


			<!-- Contents -->
			<div class="form-group">
				<label for="contents">Contents</label> 
				<textarea class="form-control" rows="5" name="contents" id="contents">
					${dto.contents}
				</textarea>
			</div>
			
    		<input type="submit" value="UPDATE" class="btn btn-primary" id="btn">

		</form>

	</div>
	
	<script type="text/javascript" src="../resources/jquery/boardInsert.js"></script>
	<script type="text/javascript" src="../resources/jquery/fileAdd.js"></script>
	

</body>
</html>