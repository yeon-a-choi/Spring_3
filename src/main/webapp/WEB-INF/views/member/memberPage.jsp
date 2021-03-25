<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Member Page</h1>
	<h3>${member.id}</h3>
	<h3>${member.name}</h3>
	<h3>${member.phone}</h3>
	<h3>${member.email}</h3>
	
	<!-- 여기에 값을 주면 보안상 문제가 생길 수 있음 -->
	<a href="./memberUpdate">수정</a><br>
	<a href="./memberDelete">탈퇴</a><br>
	<a href="../account/accountList">계좌관리</a><br>
	
	<!-- 로그인한 사람의 계좌정보 -->

</body>
</html>