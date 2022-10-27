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
	color:blue;
/* 	폰트 색상 변경 */
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
</style>
</head>
<body>
	<div class="container">
		<table>
		<tr>
			<td>학번</td>
		
		</tr>
		
	</table>
		<p>
			<fmt:formatDate pattern="HH:mm:ss" value="${ now }" />
		</p>
	</div>
</body>
</html>