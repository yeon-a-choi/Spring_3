<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
<a href="./member/memberPage"> MyPage </a><br>
<a href="./member/memberLogout"> Logout </a><br>
</c:if>

</body>
</html>
