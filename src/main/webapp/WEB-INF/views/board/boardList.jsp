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

<title>Insert title here</title>
</head>
<body>

	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container">

		<br>
		<h2>${board} List Page</h2>

		<table class="table">
			<thead class="thead-dark">
				<tr>

					<th>No</th>
					<th>Title</th>
					<th>Writer</th>
					<th>RegDate</th>
					<th>Hit</th>

				</tr>
			</thead>

			<tbody>
				<!-- list에서 하나 꺼내서 dto에 넣자 -->
				<!-- c:forEach는 for문 기억!-->
				<c:forEach items="${list}" var="dto">
					<tr>
						<!-- 값이 잘 넘어가는지 주소를 보고 확인  -->
						<td>${dto.num}</td>
						<td><a href="./${board}Select?num=${dto.num}">
						<c:if test="${board eq 'qna'}">
						<c:forEach begin="1" end="${dto.depth}">--</c:forEach>
						</c:if>
						${dto.title}
						</a></td>
						<td>${dto.writer}</td>
						<td>${dto.regdate}</td>
						<td>${dto.hit}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-outline-success" role="button"
					href="./${board}Insert"> Write </a>
	</div>
	
	
	<!-- Pageing -->
	<div class="container">
		<!-- pageing -->
		<ul class="pagination">

			<c:if test="${pager.pre}">
				<li class="page-item"><a class="page-link p"
					href="#" title="${pager.startNum-1}">Previous</a></li>
			</c:if>
					<!-- ${pager.startNum-1} -->
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<li class="page-item"><a class="page-link p" href="#" title="${i}">
					${i}
				</a></li>
				<!-- ./${board}List?curPage=${i}&kind=${pager.kind}&search=${pager.search} -->
			</c:forEach>

			<c:if test="${pager.next}">
				<li class="page-item"><a class="page-link p"
					href="#" title="${pager.lastNum+1}">Next</a></li>
			</c:if>

		</ul>



		<div class="input-group mt-3 mb-3">

			<form id="form" action="./${board}List" class="form-inline">
			
				<input type="hidden" name="curPage" value="1" id="curPage">

				<div class="input-group-prepend">

					<select class="form-control" name="kind" id="kind">
						<option class="sel">Title</option>
						<option class="sel">Contents</option>
						<option class="sel">Writer</option>
					</select>

				</div>
				<input type="text" class="form-control" name="search" id="search" value="${pager.search}"
					placeholder="검색어는 한글로 입력">

				<div class="input-group-append">
					<button class="btn btn-success" type="submit">Search</button>
				</div>

			</form>

		</div>

		<c:catch>
			<!-- 로그인을 안한다면 member.id가 null이므로 오류가 뜸. -->
			<c:if test="${member.id eq 'admin'}">
				<a class="btn btn-outline-success" role="button"
					href="./${board}Insert?num=${board.num}"> Write </a>
			</c:if>
		</c:catch>

</body>

<script type="text/javascript">

	//너무어려움...
	//3번방법
	let kind = '${pager.kind}';
	
	$(".sel").each(function(){
		let t = $(this).text();
	
		if(t == kind){
			$(this).prop("selected", true);
		}
	});
	
	
	$(".p").click(function(){
		
		let curPage = $(this).attr("title");	
		let search = '${pager.search}';
		
		$("#curPage").val(curPage);
		
		$("#form").submit();
		
	/*
	//2번 방법
	$(".p").click(function(){
		
		let curPage = $(this).attr("title");	
		let search = '${pager.search}';
		let kind = '${pager.kind}';
		
		$("#curPage").val(curPage);
		$("#kind").val(kind);
		$("#search").val(search);
		
		$("#form").submit(); 
		
	}); */
		
	//1번 방법
	/*
	$(".p").click(function(){
		location.href="./${board}List?curPage="+curPage+"&kind=${pager.kind}&search=${pager.search}";
	});*/
	
	
	});
	
</script>

</html>