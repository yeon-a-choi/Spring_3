<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:import url="../template/bootStrap.jsp"></c:import>

<title>BankBook Select</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>

	<h1>BankBook Select Page</h1>
	
	<h3>Name : ${dto.bookName}</h3>
	<h3>Number : ${dto.bookNumber}</h3>
	
	
	<a href="../account/accountMake?bookNumber=${dto.bookNumber}">계좌 개설</a>
	
	
	<!-- java에서 try catch랑 비슷한 것 -->
	<c:catch>
		<!-- 로그인을 안한다면 member.id가 null이므로 오류가 뜸. -->	
		<c:if test="${member.id eq 'admin'}">
			<a href="./bankbookDelete?bookNumber=${dto.bookNumber}"> Delete </a>
			<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}"> Update </a>
		</c:if>
	</c:catch>

	
	<!-- %가 들어간 주석은 java 포함 주석 -->
	
<%-- 	
	<c:if test="${not empty member}">
		<!-- 숫자는 상관없지만 문자는 ''를 쓰지않고 eq를 쓰면 속성값으로 인식하기 때문에 ''를 써줘야함 -->
		<c:if test="${member.id eq 'admin'}">
			<a href="./bankbookDelete?bookNumber=${dto.bookNumber}"> Delete </a>
			<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}"> Update </a>
		</c:if>
	</c:if> --%>
	
<%-- <!-- 이렇게 하나만 써도 상관없고 아래처럼 이중 if문을 써도 된다. -->
	
	<c:if test="${not empty member and member.id eq 'admin'}"> 
		<a href="./bankbookDelete?bookNumber=${dto.bookNumber}"> Delete </a>
		<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}"> Update </a>
	</c:if> --%>
	
	
</body>
</html>