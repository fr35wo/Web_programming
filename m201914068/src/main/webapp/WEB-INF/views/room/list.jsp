<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 900px;
	margin: 50px auto;
}

thead th {
	background-color: #eee;
}

table {
	border-collapse: collapse;
	width: 100%;
}

td, th {
	padding: 4px;
	border: 1px solid lightgray;
}

td:nth-child(3) {
	text-align: center;
}

.btn {
	padding: 0.4em 1em;
	border: 1px solid gray;
	border-radius: 0.5em;
	background: linear-gradient(#fff, #ddd);
	text-decoration: none;
	color: black;
	display: inline-block;
}

a {
	float: right;
	
}
</style>
</head>
<body>
	<div class="container">
		<h1>강의실목록</h1>

		<a href="create" class="btn">학생등록</a>
		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>강의실명</th>
					<th>허용인원</th>
					<th>건물</th>
					<th>강의실유형</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="school" items="${ schools }">
					<tr>
						<td><a href="edit?id=${ school.id }">${ school.roomName }</a></td>
						<td>${ school.capacity }</td>
						<td>${ school.buildingName }</td>
						<td>${ school.roomType }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>