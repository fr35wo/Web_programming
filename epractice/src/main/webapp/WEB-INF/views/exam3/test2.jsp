<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	margin-bottom: 20px;
}

label {
	display: block;
}

input, select {
	width: 200px;
	padding: 5px;
}

button {
	padding: 0.4em 1.5em;
}

div.error {
	margin-top: 20px;
	color: red;
}
</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<h1>제품 등록</h1>
			<div>
				<label>제품명</label> <input type="text" name="name"
					value="${ name }" />
			</div>
			
			<div>
				<label>가격</label> <input type="text" name="price" value="${ price }" />
			</div>
			<div>
				<label>수량</label> <input type="text" name="many"
					value="${ many }" />
			</div>
			
			<button type="submit" class="btn">제출</button>
		</form>
		<c:if test="${ not empty errorMsg }">
			<div class="error">${ errorMsg }</div>
		</c:if>
	</div>
</body>
</html>