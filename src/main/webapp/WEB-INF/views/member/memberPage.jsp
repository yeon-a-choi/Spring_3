<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 여기에 있는 member는 앞에 스코프?생략되어있음 -->
	<!-- 아래의 값은 로그인 할 때 보냄 -->
	<h1>Member Page</h1>
	<h3>${member.id}</h3>
	<h3>${member.name}</h3>
	<h3>${member.phone}</h3>
	<h3>${member.email}</h3>
	<h3><img alt="" src="../resources/upload/member/${member.memberFileDTO.fileName}"></h3>
	
	<!-- 여기에 값을 주면 보안상 문제가 생길 수 있음 -->
	<a href="./memberUpdate">수정</a><br>

	<a href="./memberDelete">탈퇴</a><br>
	<a href="../account/accountList">계좌관리</a><br>
	
	<!-- 로그인한 사람의 계좌정보 -->


</body>
</html>