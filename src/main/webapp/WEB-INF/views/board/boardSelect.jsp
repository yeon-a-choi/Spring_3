<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>Insert title here</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container">
	
		<h1>${board} Select Page</h1>
	
		<h3>Title : ${dto.title}</h3>
		<h3>Writer : ${dto.writer}</h3>
		<h3>Contents : ${dto.contents}</h3>
		
		<a href="./${board}Update?num=${dto.num}" class="btn btn-success">Update</a>
		<a href="./${board}Delete?num=${dto.num}" class="btn btn-danger">Delete</a>
		<c:if test="${board ne 'notice'}">
			<a href="./${board}Reply?num=${dto.num}" class="btn btn-info">Reply</a>
		</c:if>
	</div>

</body>
</html>