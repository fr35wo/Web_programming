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
div.a{margin-bottom: 20px;}
div.b{margin-bottom: 20px;}
div.c{margin-bottom: 20px;}

input{
height: 20px;}

button {
	padding: 0.4em 1em;
	margin: 10px;
}

div.error {
	margin-top: 20px;
	color: red;
}
div.radio label {
	margin-right: 20px;
}

</style>
</head>
<body>
	<div class="container">
		<form method="post">
			<h1>책 등록</h1>
			<div class="a">
				<div>제목</div> <input type="text" name="title"
					value="${ title }" />
			</div>
			<div class="b">
				<div>저자</div> <input type="text" name="name" value="${ name }" />
			</div>
			<div class="c">
				<div>출판사</div> <input type="text" name="lable"
					value="${ lable }" />
			</div>
			<div class="radio"><div>카테고리</div>
				<label><input type="radio" name="category" value="소설"
					${ category == "소설" ? "checked" : "" } /> 소설</label> 
				<label><input type="radio" name="category" value="과학"
					${ category == "과학" ? "checked" : "" } /> 과학</label> 
				<label><input type="radio" name="category" value="역사"
					${ category == "역사" ? "checked" : "" } /> 역사</label> 				
			</div>
			<button type="submit" class="btn">저장</button>
		</form>
		<c:if test="${ not empty errorMsg }">
			<div class="error">${ errorMsg }</div>
		</c:if>
	</div>
</body>
</html>