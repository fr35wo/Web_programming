package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Student;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.StudentMapper;

@Controller
public class StudentController {

	@Autowired StudentMapper studentMapper;
	@Autowired DepartmentMapper departmentMapper;

	 @RequestMapping("student/list")
	 public String list(Model model) {
	 List<Student> students = studentMapper.findAll();
	 model.addAttribute("students", students);
	 return "student/list";
	 }

	 @GetMapping("student/create")
	 public String create(Model model) {
	 Student student = new Student();
	 model.addAttribute("student", student);
	 model.addAttribute("departments", departmentMapper.findAll());
	 return "student/create";
	 }
//	 요청된 URL이 "student/create" 이고, GET 요청이면 이 메소드가 호출된다.
//	 학생 등록 입력 폼 URL("student/create")을 처음 서버에 요청하는 것은 GET 요청이다.


	 @PostMapping("student/create")
	 public String create(Model model, Student student) {
	 studentMapper.insert(student);
	 return "redirect:list";
//	 요청된 URL이 "student/create" 이고, POST 요청이면 이 메소드가 호출된다.
//	 학생 등록 입력 폼에 데이터를 입력하고 제출(submit) 버튼을 눌러 서버에 전송하는 것은,
//	 POST 요청이다.
//	 학생 등록 입력 폼에 입력된 데이터는 Student student 파라미터 객체에 채워져 전달된다.

//	 리턴되는 것은 뷰의 이름이 아니다.
//	 액션 메소드가 "redirect:URL" 형태의 문자열을 리턴하면,
//	 액션 메소드 뒤를 이어 뷰가 실행되지 않고, 리다이렉트 지시가 웹브라우저에 전송된다.
//	 이 리다이렉트 지시를 받은 웹브라우저는 "student/list" URL을 서버에 요청하게 된다.
//	 즉 웹브라우저 창은 목록 페이지로 넘어간다.
	 }

}










//보통 서버로부터 어떤 자료 조회 요청할 때는, GET 요청을 한다.
//서버에 어떤 데이터를 저장할 때, POST 요청을 한다.

//POST 요청
//HTML 태그에서 데이터 입력 폼은 <form> 태그로 구현한다.
//<form method="POST">
// <input type="text" name="studentNo" />
// <button type="submit">저장</button>
//</form>
//위의 입력 폼에 데이터를 입력하고, submit 버튼을 누르면,
//입력 폼에 입력된 데이터가 서버에 제출(submit) 된다.
//이때 <form method="POST"> 이므로, 이 웹브라우저의 데이터 제출 요청은 POST 요청이다.
//입력 폼에 입력된 데이터는, 이 POST 요청과 함께 서버에 전송된다.
//이 데이터를 request paramter 이라고 한다.

//GET 요청
//<form method="POST"> 입력 폼이 제출(submit)되는 경우에만 POST 요청이고,
//그 외의 대부분의 요청은 GET 요청이라고 생각해도 된다.
//즐겨찾기 클릭, URL을 직접 입력하고 엔터, 링크를 클릭
//등의 방법으로 서버에 어떤 URL을 요청하는 것은 다 GET 요청이다.

//입력 폼
//입력 폼 페이지가 웹브라우저 창에 뜨도록
//입력 폼 페이지를 처음 서버에 요청하는 것도 GET 요청이다.
//그 입력 폼에 데이터를 입력하고 저장(submit) 버튼을 누르면
//POST 요청이 서버에 전송된다.
//단 이때 <form method="POST"> 이어야 한다.
//method="POST" 부분이 없으면 POST 요청이 아니다.

//리다이렉트
//보통 데이터 입력 폼에 데이터를 입력하고 저장 버튼을 누르면,
//데이터 목록 페이지로 넘어가게 된다.
//웹에서 이 과정을 구현하는 기법이 리다이렉트(redirect) 이다.
//(1) 웹브라우저에서 데이터 입력 폼에 데이터를 입력하고 저장 버튼을 누르면,
// 서버의 어떤 액션 메소드가 호출되고,
// 입력 폼에 입력된 데이터는, 그 액션 메소드의 파라미터로 전달된다.
//(2) 그 액션 메소드는, 전달 받은 데이터를, DB에 저장하고,
// 리다이렉트 지시를 웹브라우저에 전송한다.
// 리다이렉트 지시는, 어떤 URL로 넘어가라는 명령에 해당한다.
//(3) 리다이렉트 지시를 받은 웹브라우저는,
// 그 리다이렉트 URL을 서버에 다시 요청한다.
// 그래서 웹브라우저 창에 그 URL 페이지가 뜨게 된다.

//데이터 입력 폼에 데이터를 입력하고 저장 버튼을 누르면,
//입력된 데이터가 서버에 전송되고,
//서버는 그 데이터를 저장한 후,
//목록 페이지 URL로 넘어가라는 리다이렉트 지시를 웹브라우저에 전송한다.
//리다이렉트 지시를 받은 웹브라우저는 즉시 목록 페이지 URL을 서버에 다시 요청한다.
//서버는 목록 페이지를 출력한다.
//웹브라우저 창에 목록 페이지가 출력된다.


























