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
			<div>
				<div>학번</div> <input type="text" name="number"
					value="${ number }" />				
			</div>
			
			<div>
				<div>이름</div> <input type="text" name="name"
					value="${ name }" />				
			</div>
			
			<button type="submit">확인</button>
		
		</form>
		
	</div>
</body>
</html>