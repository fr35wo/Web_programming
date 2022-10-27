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
	width: 50px;
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
	<h1> Exam2 </h1>
			<div>
				<select name="number1">
					<option value="one" ${ number1 == "one" ? "selected" : "" }>one</option>
					<option value="two" ${ number1 == "two" ? "selected" : "" }>two</option>
					<option value="three" ${ number1 == "three" ? "selected" : "" }>three</option>

				</select>
			</div>
			<div>
				<label><input type="radio" name="number2" value="one"
					${ number2 == "one" ? "checked" : "" } /> one</label> <label><input
					type="radio" name="number2" value="two"
					${ number2 == "two" ? "checked" : "" } /> two</label> <label><input
					type="radio" name="number2" value="three"
					${ number2 == "three" ? "checked" : "" } /> three</label>

			</div>
			<div>
				<label> <input type="checkbox" name="result"
					${ result ? "checked" : "" } /> 체크
				</label>
			</div>
			<button type="submit">확인</button>
			<div>
			${ number1 } 
			</div>
			<div>
			${ number2 }
			</div>
			<div>
			${ result }
			</div>
			
			
		</form>

	</div>
</body>
</html>