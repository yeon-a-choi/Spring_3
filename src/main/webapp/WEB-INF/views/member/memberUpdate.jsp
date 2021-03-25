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
		<!-- 데이터는 넘어가야하지만 id는 수정이 불가능해야하므로 type을 hidden으로 or readonly넣기 -->
		ID <input type="text" name="id" readonly=readonly value="${member.id}"><br>
		PW <input type="password" name="pw" value="${member.pw}"><br>
		Name <input type="text" name="name" value="${member.name}"><br>
		Phone <input type="text" name="phone" value="${member.phone}"><br>
		email <input type="text" name="email" value="${member.email}"><br>
		
		<button>Update</button>
	</form>
	

</body>
</html>