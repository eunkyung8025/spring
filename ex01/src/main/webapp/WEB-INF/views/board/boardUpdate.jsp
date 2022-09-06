<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
<!-- 데이터를 보낼때는 post방식 -->
<!-- 폼을 막아두고, 임의로 서브밋에 대한 **을 일으킴 -->
<!-- 등록과 수정의 차이는 원본데이터를 가져오냐 아니냐의 차이일뿐 -->
	<form name="updateForm" action="update" method="post" onsubmit="return flase">
		<div>
			<h3>게시글 수정</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<!-- 수정하지 않는 것 readonly걸고 다른 부분은 value 넣어줌 -->
				<td><input type="number" name="bno" value="${board.bno }" readonly></td>
			</tr>	
			<tr>
				<th>제목</th> <!-- name=vo랑 같게 적어줌 -->
				<td><input type="text" name="title" value="${board.title }" ></td>
			</tr>	
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value="${board.writer}" readonly></td>
			</tr>	
			<tr>
				<th>내용</th>
				<td><textarea rows="3" cols="2" style="width:100px;">${board.contents }</textarea></td>
			</tr>	
			<tr>
				<th>첨부이미지</th>
				<td><input type="text" name="image" value="${board.image }"></td>
			</tr>	


		</table>
		<button type="submit" onclick="formOnOption()">수정</button>
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
			updateForm.submit();
		}
		
	</script>
</body>
</html>