package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mid1Controller {
	@RequestMapping("mid/test1")
	public String test1(Model model) {
		model.addAttribute("myName", "홍석현");
		model.addAttribute("myNumber", "201914068");
		model.addAttribute("myArea", "IT융합자율학부");
		model.addAttribute("param1", 0);
		return "mid/test1";
	}
	@PostMapping("mid/test1")
	public String test1(Model model, String myName,  String myNumber, String myArea, Integer param1) {
		model.addAttribute("myName", myName);
		model.addAttribute("myNumber", myNumber);
		model.addAttribute("myArea", myArea);
		model.addAttribute("param1", calc(param1));

		return "mid/test1";
	}


	public int calc(int param1) {
		return ++param1;
	}
}
