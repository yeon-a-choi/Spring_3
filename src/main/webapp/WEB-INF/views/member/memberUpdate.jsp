<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Member Update Page</h1>
	<form action="./memberUpdate" method="post">
		<input type="hidden" name="id" value="${member.id}">
		PW <input type="password" name="pw" value="${member.pw}"><br>
		Name <input type="text" name="name" value="${member.name}"><br>
		Phone <input type="text" name="phone" value="${member.phone}"><br>
		email <input type="text" name="email" value="${member.email}"><br>
		
		<button>Update</button>
	</form>
	

</body>
</html>