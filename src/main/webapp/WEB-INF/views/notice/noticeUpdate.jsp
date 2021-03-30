<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>Notice Update</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>



	<br>
	<h2>Notice Update Page</h2>
	<form action="./noticeUpdate" method="post">
		
		<!-- 400 잘못된 요청 오류 -->
		<input type="text" name="num" readonly="readonly" value="${notice.num}"><br>
		<input type="text" name="title" value="${notice.title}"><br>
		<input type="text" name="writer" value="${notice.writer}"><br>
		<input type="text" name="hit" readonly="readonly" value="${notice.hit}"><br>
		<input type="text" name="regdate" readonly="readonly" value="${notice.regdate}"><br>
		<input type="text" name="contents" value="${notice.contents}"><br>
		
		<button>Update</button>


	</form>


	<!--
		<form action="./noticeUpdate" method="post">
			<div class="container">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th>No</th>
							<th>Title</th>
							<th>Writer</th>
							<th>Hit</th>
							<th>RegDate</th>
						</tr>
					</thead>
		
					<tbody>
							<tr>
								<td><input type="text" name="num" readonly="readonly" value="${notice.num}"></td>
								<td><input type="text" name="title" value="${notice.title}"></td>
								<td><input type="text" name="writer" value="${notice.writer}"></td>
								<td><input type="text" name="hit" readonly="readonly" value="${notice.hit}"></td>
								<td><input type="text" name="regdate" readonly="readonly" value="${notice.regdate}"></td>
							</tr>
							
							<tr>
								<td colspan="5"><input type="text" name="contents"  style="width:50%;" value="${notice.contents}"></td>
							</tr>
					</tbody>
		
				</table>
			</div>
		
			<button class="btn btn-outline-success">Update</button>
				
		</form>
		-->


</body>
</html>