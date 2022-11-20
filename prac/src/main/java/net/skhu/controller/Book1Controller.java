package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.Book1Mapper;

@Controller
public class Book1Controller {
	@Autowired Book1Mapper book1Mapper;
//	@Autowired StudentMapper studentMapper;
//	 StudentMapper 인터페이스를 구현한 Java 클래스를, spring mybatis가 자동으로 구현해 주고,
//	 그 클래스의 객체를 한 개 생성하여, studentMapper 멤버 변수에 자동으로 대입(autowired)해 준다.
//	 그래서 studentMapper 멤버 변수를 선언했을 뿐이고, 어떤 객체도 대입해 주지 않았지만,
//	 spring mybatis가 자동으로 생성해준 객체가 이 멤버 변수에 자동으로 대입되어 있기 때문에,
//	 액션 메소드에서 이 객체를 사용할 수 있다.

	 //전체 책 조회
	 @RequestMapping("book1/list")
	 public String list(Model model) {
	 model.addAttribute("books", book1Mapper.findAll());

//	 studentMapper.findAll() 메소드는 List<Student> 객체를 리턴한다.
//	 여기에는 DB에서 조회한 학생 목록이 들어있다.
//	 이 학생 목록을 students 이름의 model attribute로 뷰에 전달한다.
	 return "book1/list";
	 }

	 //책 제목으로 조회
	 @RequestMapping("book1/list1")
	 public String list1(Model model, String srchText) {
	 if (srchText == null) srchText = "";
	 model.addAttribute("books", book1Mapper.findByTitle(srchText + "%"));
	 model.addAttribute("srchText", srchText);
	 return "book1/list1";
	 }

	 //책 한개 조회
	 @RequestMapping("book1/detail")
	 public String detail(Model model, Integer id) {
	 if (id == null) id = 2;
	 model.addAttribute("book1", book1Mapper.findById(id));
	 return "book1/detail";
	 }

	 @RequestMapping("book1/test1")
	 public String test1(Model model) {
	 return "book1/test1";
	 }

	 @RequestMapping("book1/list2")
	 public String list2(Model model, String srchText) {
	 if (srchText == null) srchText = "";
	 model.addAttribute("books", book1Mapper.findByTitle(srchText + "%"));
	 model.addAttribute("srchText", srchText);
	 return "book1/list2";
	 }
}
