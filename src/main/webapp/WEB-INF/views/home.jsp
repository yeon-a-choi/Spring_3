<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="Ko">
<head>
<!-- Required meta tags(설명) -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="./template/bootStrap.jsp"></c:import>

<!-- css 연결 -->
<link rel="stylesheet" href="./resources/css/test.css">

<!-- js 연결 -->
<script type="text/javascript" src="./resources/js/test.js"></script>

<!-- 
<script type="text/javascript">
	alert('hello word!');
</script> -->

<title>Home</title>
</head>
<body>

	<c:import url="./template/header.jsp"></c:import>

	<div class="container" style="margin-top: 30px">
		<div class="row">
			<div class="col-sm-4">
				<h2>About Me</h2>
				<h5>Photo of me:</h5>
				<div class="fakeimg">Fake Image</div>
				<p>Some text about me in culpa qui officia deserunt mollit
					anim..</p>
				<h3>Some Links</h3>
				<p>Lorem ipsum dolor sit ame.</p>
				<ul class="nav nav-pills flex-column">
					<li class="nav-item"><a class="nav-link active" href="#">Active</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
					</li>
				</ul>
				<hr class="d-sm-none">
			</div>
			<div class="col-sm-8">
				<h2>Spring is Comming</h2>
				<h5>Chipmunk, Mar 30, 2021</h5>
				<div class="fakeimg">
					<img style="width: 50%" alt="다람쥐" src="./resources/images/s1.jpeg">
				</div>
				<p>Some text..</p>
				<p>Sunt in culpa qui officia deserunt mollit anim id est laborum
					consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
					labore et dolore magna aliqua. Ut enim ad minim veniam, quis
					nostrud exercitation ullamco.</p>
				<br>
				<h2>TITLE HEADING</h2>
				<h5>Title description, Sep 2, 2017</h5>
				<div class="fakeimg">Fake Image</div>
				<p>Some text..</p>
				<p>Sunt in culpa qui officia deserunt mollit anim id est laborum
					consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
					labore et dolore magna aliqua. Ut enim ad minim veniam, quis
					nostrud exercitation ullamco.</p>
			</div>
		</div>
	</div>

	<div class="jumbotron text-center" style="margin-bottom: 0">
		<p>Footer</p>
	</div>

	<!-- 
	
		기능
		: 글 리스트	/ 누구나 접근 가능
		: 상세보기		/ 누구나 접근 가능 - 글리스트에서 제목을 클릭		
		: 글 수정		/ 관리자만 접근 가능
		: 글 삭제		/ 관리자만 접근 가능
		: 글 작성		/ 관리자만 접근 가능
	
		Back-end
		 : com.ee.y3.notice
		 : notice mapper
		
		
			- NoticeDTO	
				
			- NoticeMapper
			
			- NoticeDAO
				getList 	: 글 리스트
				getSelete	: 상세보기
				setInsert	: 글 작성
				setDelete	: 글 삭제
				setUpdate	: 글 수정
				- 할 수 있다면 하기, select할 때 증가시켜야함.
				setHipUpdate : 조회수 1증가 -> select에 같이 호출
				
			- NoticeService
				getList 	: 글 리스트
				getSelete	: 상세보기
				setInsert	: 글 작성
				setDelete	: 글 삭제
				setUpdate	: 글 수정
			
			- NoticeController
				getList 	: 글 리스트
				getSelete	: 상세보기
				setInsert	: 글 작성 v 2개필요(get,post)
				setDelete	: 글 삭제
				setUpdate	: 글 수정 v 2개필요(get,post)
			
				
		Front-end
		 : WEB-INF/view/notice/
		 
		 		글 리스트
		 		/notice/noticeList		GET		noticeList.jsp
		 
		 		글 상세보기
		 		/notice/noticeSelect	GET		noticeSelect.jsp
		 		
		 		글 작성
		 		/notice/noticeInsert	GET		noticeInsert.jsp
		 		/notice/noticeInsert	POST	글 리스트로 이동
		 		
		 		글 수정
		 		/notice/noticeUpdate	GET		noticeUpdate.jsp
		 		/notice/noticeUpdate	POST	글 리스트로 이동
		 		
		 		글 삭제
		 		/notice/noticeDelete	GET		글 리스트로 이동
	
	 -->

</body>
</html>