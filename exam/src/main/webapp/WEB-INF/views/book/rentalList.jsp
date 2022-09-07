<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>���� ��ȸ</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>������ȣ</th>
				<th>������</th>
				<th>ǥ��</th>								
				<th>��������</th>
				<th>�ݾ�</th>
				<th>���ǻ�</th>								
				<th>���� �Ұ�</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList} ">
				<tr>
					<td>${book.bookNo} </td>
					<td>${book.bookName} </td>
					<td>${book.bookCoverImg} </td>
					<td><fmt:formatDate value="${book.bookDate} " pattern="yyyy/MM/dd"></fmt:formatDate></td>
					<td>${book.bookPrice} </td>
					<td>${book.bookPublisher} </td>					
					<td>${book.bookInfo} </td>				
			</c:forEach>
		</tbody>
	</table>
</body>
</html>