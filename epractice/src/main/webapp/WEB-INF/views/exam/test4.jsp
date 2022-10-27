<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 400px;
	margin: 20px auto;
}

div.radio label {
	margin-right: 20px;
}

button {
	padding: 0.4em 2em;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">


			<div class="radio">
				<label><input type="radio" name="color" value="yellow"
					${ color == "yellow" ? "checked" : "" } /> yellow</label> 
				<label><input type="radio" name="color" value="red"
					${ color == "red" ? "checked" : "" } /> red</label> 
				<label><input type="radio" name="color" value="blue"
					${ color == "blue" ? "checked" : "" } /> blue</label> 
					
				<button type="submit">확인</button>
			</div>

		</form>
	</div>
</body>
</html>