<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav>
	<ul class="nav">
	<!-- 링크는 jstl로 넣어줌 (pageContext: 페이지에 대한 정보를 가진 객체)-->
		<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath }/board/list">게시판</a></li>
		<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath }/board/insert">게시글 등록</a></li>
	</ul>

</nav>    

