<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style>
table {
	border-collapse: collapse;
}

td {
	border: 1px solid gray; padding:5px;
}

</style>
</head>
<body>
	<table>
		<tr>
			<td>학번</td>
			<td>${ userid }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${ name }</td>
		</tr>
	</table>
</body>
</html>