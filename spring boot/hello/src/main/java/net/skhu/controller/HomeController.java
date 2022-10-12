package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//URL요청에 의해 서버에서 실행될 controller 클래스와 action method를 구분해야 한다.
//Controller 클래스는 웹브라우저의 URL요청을 받아 웹서버에서 실행되는 자바 클래스이다.
//웹브라우저가 웹서버에 어떤 URL을 요청하면 그 URL에 해당되는 컨트롤러의 메소드가 자동으로 호출, 실행

@Controller
//해당 어노테이션이 적용된 클래스는 Controller임을 나타낸다
public class HomeController {
	@RequestMapping("home/index")
//	해당 어노테이션이 선언된 클래스의 모든 메소드가 하나의 요청에 대한 처리를 할 경우 사용
	 public String index(Model model) {
	//대부분 액션 메소드의 파라미터에 Model객체가 포함.
	//컨트롤러의 액샨 메소드가 뷰 파일에 전달할 데이터들, Model객체에 넣어서 전달
	 model.addAttribute("message", "좋은 아침입니다");
//	 model의 데이터이름, 데이터의 값 추가
	 model.addAttribute("now", new Date());
//	 뷰 파일에 전달할 데이터를 Model객체에 넣는 코드
	 return "home/index";
	 //이 이름으로 뷰 파일 찾음
	 }
	@RequestMapping("home/test1")
	public String test1(Model model) {
		model.addAttribute("myName","홍석현");
		return "home/test1";
	}

}
//404 에러 났을 때
//웹브라우저 URL요청에 대해 서버에서 실행해야할 것을 찾지 못할 때의 발생하는 에러
//찾을 대상은 다음과 같다.
//컨트롤러 클래스, 컨트롤러 클래스의 액션 메소드, 뷰 파일
//어노테이션과 URL이 완전히 일치하는 액션 메소드가 여럿이면 안된다.
//어노테이션의 URL이 같으면 구별 못함

//500 에러 났을 때 (자바쪽 에러)

//HTTP Request, HTTP Response
//웹브라우저로부터 웹서버로 전달되는 데이터를 HTTP Request 이라고 한다.
//웹브라우저가 웹서버에게 무엇인가를 요구(요청)하는 것이 HTTP Request 이다.
//웹서버로부터 웹브라우저에게 전달되는 데이터를 HTTP Response라고 한다.
//웹브라우저로부터 요구(요청) 받은 것을 처리한 결과 데이터가 HTTP Response이다.

//HTTP Request 구조

//-URL
//요청하는 대상에 대한 주소이다.
//ex)https://www.google.com/search?q=student 검색이니까 get요청

//HTTP Request Method
//이 요청이 어떤 종류의 작업을 서버에 요청하는 것인지 구분하기 위한 속성이다.
//POST 데이터 게시(게시글,댓글,저장) GET 데이터 달라(질문)

//HTTP Request Header
//요청에 대한 부가 설명이 들어있다.
// 웹브라우저 버전, 웹브라우저 언어 설정, 문자 인코딩

//HTTP Request Body
//요청에 포함된 데이터가 들어있다.
//get 요청일땐 특별히 body없음
//post요청 일때는 게시글 댓글이 요청에 담겨 서버에 가야함 담기는 곳이 body

//request parameter 요청에 담겨있는 데이터
//웹브라우저가 웹서버의 URL을 요청하는 것을 HTTP request이라고 한다.
//서버가 Spring Web MVC 앱인 경우, 이 요청에 의해서 컨트롤러의 액션 메소드가 자동으로 호출된다.
//이 요청(HTTP Request)에 같이 담겨서 서버에 전달되는 파라미터를, request parameter이라고 한다.
//request parameter는 액션 메소드의 파라미터 변수에 전달된다.
//메소드 호출시 파라미터로 뭔가 전달 query string = request parameter

//파라미터 종류
//-query string
//query string은 request parameter가 되어 서버에 전달

//-입력 폼: 게시글 댓글 입력
//<form method="post"> **method= post적어줘야 post요청이 된다 안적어 주면 get
//<input type="text" name="title" />
//<input type="number" name="price"/>
//<button type="submit">저장</button>
//</form>

//<input type="text" name="title" />
//<input type="number" name="price"/>
//입력 폼에 입력하고 submit버튼 누르면 입력된 값들이 서버에 전송 (request parameter로 전송)
//input태그의 값이 request parameter의 이름
//입력 폼에 입력하고 submit버튼 누르면 입력된 값들이 서버에 전송 = request parameter data
//시험나옴***********
//위 form 태그에 의해, 웹브라우저창에 입력폼이 그려진다.
//이 입력폼의 두 칸에 '우유', '1000'을 각각 입력하고 submit 버튼을 클릭하면,
//다음과 같은 request parameter가 서버에 전달된다.
//input 태그의 name 속성값이 request parameter name이 된다.
//request parameter name| request parameter value
//title 				|	우유
//price 				|	1000
//get 요청일 땐 post와 달리 body가 없기 때문에 입력 폼에 입력된 값이 query string에 담겨 서버에 requst parameter data가전송
//	http://?title=우유&price=1000
//post 요청일 때 request parameter는 URL의 query string과 request body에 들어있을 수 있다.(둘 중 하나 가능)

//request method
//웹브라우저가 웹서버의 URL을 요청하는 것을 HTTP request라고 한다. 요청 방식 정도로 해석
//GET (조회 요청) 서버의 어떤 자료를 조회하기 위한 요청
//POST (등록/수정/삭제 요청) 자료를 등록/수정/삭제하기 위한 요청

//수업에선 get post만 씀
//GET (조회 요청) 서버의 어떤 자료를 조회하기 위한 요청
//POST (등록 요청) 새 자료를 등록 위한 요청
//PUT (수정 요청) 기존 자료를 수정하기 위한 요청
//DELETE (삭제 요청) 기존 자료를 삭제하기 위한 요청

//request method 지정 방법
//<form method="POST">
//위의 예와 같이 form 태그에 request method를 지정할 수 있다.
//위 form 태그 내부의 submit 버튼이 클릭되면, POST 방식의 HTTP request가 서버에 전달된다.
//form 태그에 request method를 지정하지 않으면, 디폴트 값은 GET 이다.

//디폴트 request method는 GET 이다.
//request method를 따로 지정하지 않으면, 디폴트 값은 GET 이다.
//- a 태그가 클릭되어 서버에 HTTP request가 전달될 때.
//- 웹브라우저의 주소칸에 URL을 입력하고 엔터키를 눌렀을 때.
//- 즐겨찾기 항목을 눌렀을 때.

//액션 메소드 어노테이션
//액션 메소드에는 다음의 어노테이션 중 하나가 붙어있어야 한다.
//@RequestMapping("URL") - URL이 요청된 경우에 이 액션 메소드가 실행된다. (GET, POST 무관/ URL만 일치하면 된다)
//@GetMapping("URL") - URL이 GET 방식으로 요청된 경우에만 이 액션 메소드가 실행된다
//@PostMapping("URL") - URL이 POST 방식으로 요청된 경우에만 이 액션 메소드가 실행된다
//액션 메소드에 위 어노테이션 중 하나가 붙어있지 않거나
//URL에 오타가 있으면, URL을 요청했을 때 404 Not Found 에러가 발생한다.




