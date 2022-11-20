<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 600px;
	margin: 50px auto;
}

body {
	font-family: 굴림체;
}

table {
	width: 500px;
	border-collapse: collapse;
}

table td:nth-child(1) {
	background-color: #eee;
}

td {
	padding: 5px;
	border: 1px solid lightgray;
}
</style>
</head>
<body>
	<div class="container">
		<h1>학생</h1>
		<table>
			<tr>
				<td>ID</td>
				<td>${ book1.id }</td>
			</tr>
			<tr>
				<td>학번</td>
				<td>${ book1.title }</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${ book1.categoryName }</td>
			</tr>
			<tr>
				<td>학과ID</td>
				<td>${ book1.categoryId }</td>
			</tr>
			
			<tr>
				<td>전화</td>
				<td>${ book1.author }</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>${ book1.price }</td>
			</tr>
			
		</table>
	</div>
</body>
</html>
