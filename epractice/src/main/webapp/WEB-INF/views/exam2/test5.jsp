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

.error {
	color: red;
	margin: 5px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<div>
				<input type="text" name="color1" value="${ choice.color1 }" />

			</div>

			<div class="radio">
				<label><input type="radio" name="color2" value="yellow"
					${ choice.color2 == "yellow" ? "checked" : "" } /> yellow</label> <label><input
					type="radio" name="color2" value="red"
					${ choice.color2 == "red" ? "checked" : "" } /> red</label> <label><input
					type="radio" name="color2" value="blue"
					${ choice.color2 == "blue" ? "checked" : "" } /> blue</label>

				<button type="submit">확인</button>
			</div>
			<div class="error">${ errorMsg }</div>

		</form>
	</div>
</body>
</html>