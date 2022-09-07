<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서등록 화면</title>
</head>
<body>
	<form action="bookInsert" method="post">
		<div>bookNo<input name="bookNo"></div>	
		<div>bookName<input name="bookName"></div>
		<div>bookCoverImg<input name="bookCoverImg"></div>
		<div>bookDate<input type="date" name="bookDate"></div>
		<div>bookPrice<input name="bookPrice"></div>
		<div>bookPublisher<input name="bookPublisher"></div>
		<div>bookPublisher<input name="bookInfo"></div>
		<button>등록</button>
	</form>
</body>
</html>