<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- ������ �� ��� ȭ�� -->
	<!-- empInfo�� �ִ� �� ������ -->
	<form action="insertInfo" method="post">
		<div>
			<label> id : <input type="text" name="employeeId"></label>
		</div>
		<div>
			<label> first_name : <input type="text" name="firstName"></label>
		</div>
		<div>
			<label> last_name : <input type="text" name="lastName"></label>
		</div>
		<div>
			<label> email : <input type="text" name="email"></label>
		</div>
		<div>
			<label> job_id : <input type="text" name="jobId"></label>
		</div>
		<div>
			<label> salary : <input type="text" name="salary"></label>
		</div>
		<div>
			<button type="submit">���</button>
			<button type="button">���</button>
		</div>
	</form>
</body>
</html>