<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
<!-- 데이터를 보낼때는 post방식 -->
<!-- 폼을 막아두고, 임의로 서브밋에 대한 **을 일으킴 -->
	<form name="insertForm" action="insert" method="post" onsubmit="return flase">
		<div>
			<h3>게시글 등록</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${no }" readonly></td>
			</tr>	
			<tr>
				<th>제목</th> <!-- name=vo랑 같게 적어줌 -->
				<td><input type="text" name="title"></td>
			</tr>	
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>	
			<tr>
				<th>내용</th>
				<td><textarea name="contents"></textarea></td>
			</tr>	
			<tr>
				<th>첨부이미지</th>
				<td><input type="text" name="bno"></td>
			</tr>	


		</table>
		<button type="submit" onclick="formOnOption()">등록</button>
		<button type="button">목록</button>	
	</form>
	<script>
		/* 등록버튼을 눌럿을때 바로실행되지 않고 버튼을 눌렀을때만 서브밋을 일으키게 */
		function formOption() {
			
			let title=document.getElementsByName('title')[0];
			let writer=document.getElementsByName('writer')[0];
			let contents=document.getElementsByName('contents')[0];

			if(title.value=="") {
				alert("제목이 입력되지 않았습니다.");
				title.focus();
				return;
			}
			
			if(writer.value=="") {
				alert("작성자가 입력되지 않았습니다.");
				writer.focus();
				return;
			}
			if(contents.value=="") {
				alert("내용이 입력되지 않았습니다.");
				contents.focus();
				return;
			}
			insertForm.submit();
		}
		
	</script>
</body>
</html>