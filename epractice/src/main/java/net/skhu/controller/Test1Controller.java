package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1Controller {

	@RequestMapping("exam/test1")
	public String test1(Model model) {
		model.addAttribute("myNumber", "201914068");
		model.addAttribute("myName", "홍석현");
		return "exam/test1";
	}

}
