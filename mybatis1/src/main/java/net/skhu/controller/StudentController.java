package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.StudentMapper;

@Controller
public class StudentController {
//	StudentMapper 인터페이스를 구현한 Java 클래스를, spring mybatis가 자동으로 구현해 주고,
//	 그 클래스의 객체를 한 개 생성하여, studentMapper 멤버 변수에 자동으로 대입(autowired)해 준다.
//	 그래서 studentMapper 멤버 변수를 선언했을 뿐이고, 어떤 객체도 대입해 주지 않았지만,
//	 spring mybatis가 자동으로 생성해준 객체가 이 멤버 변수에 자동으로 대입되어 있기 때문에,
//	 액션 메소드에서 이 객체를 사용할 수 있다.
	@Autowired
	StudentMapper studentMapper;

	@RequestMapping("student/list")
	public String list(Model model) {
		model.addAttribute("students", studentMapper.findAll());
		return "student/list";
	}
//	 studentMapper.findAll() 메소드는 List<Student> 객체를 리턴한다.
//	 여기에는 DB에서 조회한 학생 목록이 들어있다.
//	 이 학생 목록을 students 이름의 model attribute로 뷰에 전달한다.

	@RequestMapping("student/list1")
	 public String list1(Model model, String srchText) {
	 if (srchText == null) srchText = "";
	 model.addAttribute("students", studentMapper.findByName(srchText + "%"));
	 model.addAttribute("srchText", srchText);
	 return "student/list1";
	 }

	@RequestMapping("student/detail")
	 public String detail(Model model, Integer id) {
	 if (id == null) id = 5;
	 model.addAttribute("student", studentMapper.findById(id));
	 return "student/detail";
	 }
	//매개변수 자료형이 int 일때는 null값을 채우지 못한다. 따라서 null값이 데이터에 있다면 Integer타입으로 선언해야 한다.

	@RequestMapping("student/test1")
	 public String test1(Model model) {
	 return "student/test1";
	 }

	@RequestMapping("student/list2")
	 public String list2(Model model, String srchText) {
	 if (srchText == null) srchText = "";
	 model.addAttribute("students", studentMapper.findByName(srchText + "%"));
	 model.addAttribute("srchText", srchText);
	 return "student/list2";
	 }

	@RequestMapping("student/list3")
	 public String list3(Model model, String srchText) {
	 if (srchText == null) srchText = "";
	 model.addAttribute("students", studentMapper.findByName(srchText + "%"));
	 model.addAttribute("srchText", srchText);
	 return "student/list3";
	 }

}
