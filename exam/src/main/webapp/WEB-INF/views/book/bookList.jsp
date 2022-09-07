<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 조회</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>								
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>								
				<th>도서 소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>${book.bookNo} </td>
					<td>${book.bookName} </td>
					<td>${book.bookCoverImg} </td>
					<td><fmt:formatDate value="${book.bookDate}" pattern="yyyy/MM/dd"></fmt:formatDate></td>
					<td>${book.bookPrice} </td>
					<td>${book.bookPublisher} </td>					
					<td>${book.bookInfo} </td>	
				</tr>		
			</c:forEach>
		</tbody>
	</table>
</body>
</html>