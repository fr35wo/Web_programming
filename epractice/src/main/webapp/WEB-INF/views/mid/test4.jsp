<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
.error { color: red; margin: 5px; }
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<div>
				<label>제목:</label> <input type="text" name="title"
					value="${ title }" />
			</div>
			<div>
				<label>저자:</label> <input type="text" name="author"
					value="${ author }" />
			</div>
			<div>
				<label>출판사:</label> <input type="text" name="lable"
					value="${ lable }" />
			</div>
			<div>
				<label>종류:</label><select name="type">
					<option value="1" ${ type == "1" ? "selected" : "" }>소설</option>
					<option value="2" ${ type == "2" ? "selected" : "" }>수필</option>
					<option value="3" ${ type == "3" ? "selected" : "" }>과학</option>
					<option value="4" ${ type == "4" ? "selected" : "" }>인문</option>
				</select>
			</div>

			<button type="submit">확인</button>

			<div class="error">${ errorMsg }</div>
		</form>
	</div>
</body>
</html>