<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>Notice Select Page</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<div class="container">

		<br>
		<h2>Notice Select Page</h2>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Title</th>
					<th>Writer</th>
					<th>Hit</th>
					<th>RegDate</th>
				</tr>
			</thead>

			<tbody>
					<tr>
						<td>${notice.title}</td>
						<td>${notice.writer}</td>
						<td>${notice.hit}</td>
						<td>${notice.regdate}</td>
					</tr>
					
					<tr>
						<td colspan="4">${notice.contents}</td>
					</tr>
			</tbody>

		</table>
	</div>
	
	<c:catch>
		<!-- 로그인을 안한다면 member.id가 null이므로 오류가 뜸. -->	
		<c:if test="${member.id eq 'admin'}">
			&ensp;&ensp;&ensp;<a class="btn btn-outline-success" role="button" href="./noticeDelete?num=${notice.num}"> Delete </a>
			<a class="btn btn-outline-success" role="button" href="./noticeUpdate?num=${notice.num}"> Update </a>
		</c:if>
	</c:catch>



</body>
</html>