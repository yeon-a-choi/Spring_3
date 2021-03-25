<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- page session false로 되면 값 안넘어옴 -->
<!--  @page session="true" 이 부분 아에 지워버리기 -->

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="./bankbook/bankbookList"> Go BankBook List </a><br>


<c:if test="${empty member}">
	<a href="./member/memberJoin"> Join </a><br>
	<a href="./member/memberLogin"> Login </a><br>
</c:if>

<c:if test="${not empty member}">
	<!-- sessionScope.member.id로 작성하지만 위에 같은게 없다면 sessionScope는 생략가능 -->
	<h3>${member.id} 님 환영합니다!</h3>
	<a href="./member/memberPage"> MyPage </a><br>
	<a href="./member/memberLogout"> Logout </a><br>
</c:if>

</body>
</html>
