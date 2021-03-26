<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<!-- nav -->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

		<!-- Brand -->
		<!-- 배포 후 값이 변할 수 있으니 받아오기 -->
		<a class="navbar-brand" href="${pageContext.request.contextPath}/">Logo</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/bankbook/bankbookList">Product</a></li>
			
			<c:if test="${empty member}">
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/member/memberLogin">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/member/memberJoin">Join</a></li>
			</c:if>
			
			<c:if test="${not empty member}">
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/member/memberPage">MyPage</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/member/memberLogout">Logout</a></li>
			</c:if>

			<!-- Dropdown -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> Dropdown link </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Link 1</a> <a
						class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
						href="#">Link 3</a>
				</div></li>
		</ul>

	</nav>
