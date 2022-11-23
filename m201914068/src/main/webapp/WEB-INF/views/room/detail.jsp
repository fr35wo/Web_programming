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
		<h1>강의실</h1>
		<table>
			<tr>
				<td>ID</td>
				<td>${ school.id }</td>
			</tr>
			<tr>
				<td>강의실명</td>
				<td>${ school.roomName }</td>
			</tr>
			<tr>
				<td>빌딩ID</td>
				<td>${ school.buildingId }</td>
			</tr>
			<tr>
				<td>빌딩</td>
				<td>${ school.buildingName }</td>
			</tr>
			
			<tr>
				<td>허용인원</td>
				<td>${ school.capacity }</td>
			</tr>
			<tr>
				<td>강의실유형</td>
				<td>${ school.roomType }</td>
			</tr>
			
		</table>
		<a href="list">돌아가기</a>
	</div>
</body>
</html>