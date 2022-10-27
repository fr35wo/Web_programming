<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 400px;
	margin: 20px auto;
}

form div {
	margin-bottom: 10px;
}

label {
	display: inline-block;
	width: 70px;
	text-align: right;
}

input {
	width: 150px;
	padding: 4px;
}

select {
	width: 150px;
	padding: 4px;
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
			
			<div>
				 <select name="color">
					<option value="yellow" ${ color == "yellow" ? "selected" : "" }>yellow</option>
					<option value="red" ${ color == "red" ? "selected" : "" }>red</option>
					<option value="blue" ${ color == "blue" ? "selected" : "" }>blue</option>
					
				</select>
				<button type="submit">확인</button>
			</div>
			
		</form>
		
	</div>
</body>
</html>