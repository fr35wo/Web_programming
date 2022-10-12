<!-- 뷰: 웹브라우저의 요청(http request)에 대한 서버의 응답(http response) -->
<!-- Model: 데이터를 채워서 전달하기 위한 객체 -->
<!-- 뷰의 역할: 태그 만들어 웹브라우저에출력 화면 출력과 관련된 코드는 View에만 구현-->
<!-- Controller: 전체적인 실행 흐름 제어 실행 흐름 제어와 관련된 코드는 여기에만-->
<!-- 컨트롤러와 모델은 java클래스로 구현 -->
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%-- <fmt:formatDate /> 확장 태그를 사용하려면, 먼저 이 선언이 있어야 한다. --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>
	<h1>안녕하세요</h1>
	<h3>${ message }</h3>
<!-- 	model 애트리뷰트 값 출력 -->
	<h3><fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" value = "${ now }" /></h3>
<%-- <fmt:formatDate /> 태그는 날짜와 시각을 포멧에 맞춰서 출력하기 위한 JSTL 확장 태그이다. --%>
<!-- JSTL 확장 태그를 사용하기 위해 pom.xml 파일에 JSTL dependency를 이미 추가했다. -->
</body>
</html>

<!-- 실행 순서 -->
<!-- 웹브라우저에서 웹서버에 요청(http request)이 전달되면, -->
<!-- 요청된 URL과 일치하는, 컨트롤러의 액션 메소드가 실행된다. -->
<!-- 그리고 액션 메소드의 뒤를 이어서 뷰(view) 파일이 실행된다. -->
<!-- 뷰 파일의 실행 결과 출력된 html 태그들이 웹브라우저로 전송된다. -->

