<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>BankBook List Page</h1>
	
	<table>
		<thead>
			<tr>
			
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			
			</tr>
		</thead>
		
		<tbody>
			<!-- list에서 하나 꺼내서 dto에 넣자 -->
			<!-- c:forEach는 for문 기억!-->
			<c:forEach items="${list}" var="dto">
			<tr>
														<!-- 값이 잘 넘어가는지 주소를 보고 확인  -->
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>
				
			</tr>
			</c:forEach>
		</tbody>
	
	
	</table>

</body>
</html>