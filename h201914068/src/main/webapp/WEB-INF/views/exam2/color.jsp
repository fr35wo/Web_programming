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
	background-color: ${ color };
	border: 1px solid black;
	padding: 20px;
}

label {
	display: inline-block;
	width: 70px;
	text-align: right;
}

input {
	width: 100px;
	padding: 4px;
}

select {
	
	padding: 4px;
}

button {
	padding: 0.4em 1em;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			
			<div>
			<h1>Color</h1>
				 <select name="color">
				 	<option value="red" ${ color == "red" ? "selected" : "" }>red</option>
				 	<option value="green" ${ color == "green" ? "selected" : "" }>green</option>
				 	<option value="blue" ${ color == "blue" ? "selected" : "" }>blue</option>
					<option value="yellow" ${ color == "yellow" ? "selected" : "" }>yellow</option>
									
				</select>
				<button type="submit">저장</button>
			</div>
			
				
			
		</form>
		${ color }
	</div>
</body>
</html>