<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="../template/bootStrap.jsp"></c:import>


<title>BankBook List</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	
	
	
	<div class="container">
		
		<br>
		<h2>BankBook List Page</h2>	
	
		<table class="table">
			<thead class="thead-dark">
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
	
	</div>
	
	<div class="container">
	
		<!-- pageing -->
		<ul class="pagination">
		
		  <c:if test="${pager.pre}">
		  	<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}">Previous</a></li>
		  </c:if>
		  
		  <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
		  </c:forEach>
		  
		  <c:if test="${pager.next}">
		  	<li class="page-item"><a class="page-link" href="./bankbookList?curPage=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}">Next</a></li>
		  </c:if>
		 
		</ul>
		
		
		<!-- search -->
		<div class="input-group mt-3 mb-3">
		
			<form action="./bankbookList" class="form-inline">
			
			  <div class="input-group-prepend">
			  
			   <select class="form-control" name="kind" id="sel1">
			    <option>BookName</option>
			    <option>Rate</option>
			    <option>Sale</option>
			   </select>
			  	
			  </div>
			  
			  <input type="text" class="form-control" name="search" placeholder="검색어는 한글로 입력">
			  
			  <div class="input-group-append">
			    <button class="btn btn-success" type="submit">Search</button>
			  </div>
			  
			 </form>
			  
		</div>

	</div>

</body>
</html>