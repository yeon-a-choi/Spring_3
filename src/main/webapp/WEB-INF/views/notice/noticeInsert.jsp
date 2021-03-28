<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>Notice Insert Page</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">

		<br>
		<h2>Notice Insert Page</h2>

		<form action="./noticeInsert" method="post">
			<!-- Title -->
			<div class="form-group">
				<label for="title">Title</label> <input type="text" class="form-control"
					id="title" name="title" aria-describedby="titleHelp">
			</div>


			<!-- Writer -->
			<div class="form-group">
				<label for="writer">Writer</label> <input type="text"
					class="form-control" id="writer" name="writer">
			</div>


			<!-- Contents -->
			<div class="form-group">
				<label for="contents">Contents</label> <input type="text"
					class="form-control" id="contents" name="contents">
			</div>

			<button type="submit" class="btn btn-primary">Insert</button>

		</form>

	</div>

</body>
</html>