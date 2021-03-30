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


<title>Notice List</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container">
		
		<br>
		<h2>Notice List Page</h2>	
	
		<table class="table">
			<thead class="thead-dark">
				<tr>
	
					<th>No</th>
					<th>Title</th>
					<th>Writer</th>
					<th>Hit</th>
					<th>RegDate</th>
	
				</tr>
			</thead>
	
			<tbody>
				<!-- list에서 하나 꺼내서 dto에 넣자 -->
				<!-- c:forEach는 for문 기억!-->
				<c:forEach items="${list}" var="notice">
					<tr>
						<!-- 값이 잘 넘어가는지 주소를 보고 확인  -->
						<td>${notice.num}</td>
						<td><a href="./noticeSelect?num=${notice.num}">${notice.title}</a></td>
						<td>${notice.writer}</td>
						<td>${notice.hit}</td>
						<td>${notice.regdate}</td>
	
					</tr>
				</c:forEach>
			</tbody>			
		</table>
	</div>
	
	<div class="container">
		<ul class="pagination">
		
		  <c:if test="${pager.pre}">
		  	<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.startNum-1}&kind=${pager.kind}&search=${pager.search}">Previous</a></li>
		  </c:if>
		  
			  <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			  	<li class="page-item"><a class="page-link" href="./noticeList?curPage=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
			  </c:forEach>
			  
		  <c:if test="${pager.next}">
		  	<li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.lastNum+1}&kind=${pager.kind}&search=${pager.search}">Next</a></li>
		  </c:if>
		  
		</ul>
		
		<div class="input-group mt-3 mb-3">
		
			<form action="./noticeList" class="form-inline">
			
			  <div class="input-group-prepend">
			  
			   <select class="form-control" name="kind" id="sel1">
			    <option>Title</option>
			    <option>Contents</option>
			    <option>Writer</option>
			   </select>
			  	
			  </div>
			  <input type="text" class="form-control" name="search" placeholder="검색어는 한글로 입력">
			  
			  <div class="input-group-append">
			    <button class="btn btn-success" type="submit">Search</button>
			  </div>
			  
			 </form>
			  
		</div>

	</div>
	
	<c:catch>
		<!-- 로그인을 안한다면 member.id가 null이므로 오류가 뜸. -->	
		<c:if test="${member.id eq 'admin'}">
			&ensp;&ensp;&ensp;<a class="btn btn-outline-success" role="button" href="./noticeInsert?num=${notice.num}"> Insert </a>
		</c:if>
	</c:catch>

</body>
</html>