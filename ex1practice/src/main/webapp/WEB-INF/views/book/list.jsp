<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
div.container {
	width: 800px;
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

.btn {
	padding: 0.4em 1em;
	border: 1px solid gray;
	border-radius: 0.5em;
	background: linear-gradient(#fff, #ddd);
	text-decoration: none;
	color: black;
	display: inline-block;
}

a.btn { float: right; margin: -20px 0 5px 0; }

</style>
</head>
<body>
	<div class="container">
		<h1>책목록</h1>
		<a href="create" class="btn">책등록</a>
		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>제목</th>
					<th>작가</th>
					<th>카테고리ID</th>
					<th>가격</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${ books }">
					<tr>
						<td><a href="edit?id=${ book.id }">${ book.title }</a></td>
						<td>${ book.author }</td>
						<td>${ book.categoryId }</td>
						<td>${ book.price }</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>