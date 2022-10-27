<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
div.container {
	width: 600px;
	margin: 20px auto;
}

form div {
	margin-bottom: 10px;
}

input {
	width: 200px;
	padding: 4px;
}

button {
	padding: 0.4em 3em;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<div>	<label>이름:</label>		
				<input type="text" name="myName" value="${ myName }" />
			</div>
			<div>	<label>학번:</label>	
				<input type="text" name="myNumber" value="${ myNumber }" />
			</div>
			<div>	<label>소속:</label>		
				<input type="text" name="myArea" value="${ myArea }" />
			</div>
			<div>	<label>횟수:</label>		
				<input type="text" name="param1" value="${ param1 }" />
			</div>
			
			<button type="submit">확인</button>
			
		</form>
	</div>
</body>
</html>