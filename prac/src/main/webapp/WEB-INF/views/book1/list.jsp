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

td:nth-child(4) {
	text-align: center;
}
</style>
</head>
<body>
	<div class="container">
		<h1>학생목록</h1>

		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>학번</th>
					<th>이름</th>
					<th>학과</th>
					<th>전화</th>
					<th>성별</th>
					<th>이메일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book1" items="${ books }">
					<tr>
						<td>${ book1.id }</td>
						<td>${ book1.title }</td>
						<td>${ book1.categoryName }</td>
						<td>${ book1.author }</td>
						<td>${ book1.price }</td>
						<td>${ book1.categoryId }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>