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

input {
	padding: 5px;
	font-size: 10pt;
}

button {
	margin: 10px;
	padding: 0.4em 2em;
}

tr[data-url]:hover {
	background-color: #ffb;
	cursor: pointer;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- 웹브라우저에서 실행되는 간단한 기능을 자바스크립트로 구현 할 때, jquery 자바스크립트 라이브러리가 널리 사용된다. -->
<!--  이것을 사용하려면 웹페이지에 위의 태그가 포함되어야 한다. -->


</head>
<body>
	<div class="container">
		<h1>학생목록</h1>
		<form>
			<label>이름</label> <input type="text" name="srchText"
				value="${ srchText }" placeholder="검색조건" />
			<button type="submit">조회</button>
		</form>

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
				<c:forEach var="student" items="${ students }">
					<tr data-url="detail?id=${ student.id }">
						<td>${ student.studentNo }</td>
						<td><a href="detail?id=${ student.id }">${ student.name }</a></td>
						<td>${ student.departmentName }</td>
						<td>${ student.phone }</td>
						<td>${ student.sex }</td>
						<td>${ student.email }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- jquery $ 함수 -->
	<!-- jquery 기능을 사용하는 자바스크립트 코드의 형태는 다음과 같다. -->
	<!-- $("CSS실렉터").메소드(파라미터); -->
	<!-- 위 코드에서 "CSS실렉터" 부분이 따옴표로 묶여 있음에 주목하자. -->
	<!-- 위 코드는 CSS실렉터 가 지정하는 태그들에 대해서 메소드를 실행한다. -->
	<!-- 예: -->
	<!-- $("[data-url]").click(...); -->
	<!-- data-url 애트리뷰트를 가진 태그들에 대해서 click 메소드를 실행한다. -->
	<script>
		$("[data-url]").click(function() {
			var url = $(this).attr("data-url");
			location.href = url;
		})
	</script>
</body>
</html>