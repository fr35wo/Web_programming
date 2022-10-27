package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test4Controller {
	@GetMapping("exam/test4")
	public String check1(Model model) {
		return "exam/test4";
	}

	@PostMapping("exam/test4")
	public String check1(Model model,String color) {
		model.addAttribute("color", color);
		System.out.println(color);
		return "exam/test4";
	}
}
