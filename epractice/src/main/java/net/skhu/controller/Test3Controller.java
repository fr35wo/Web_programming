package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test3Controller {
	@GetMapping("exam/test3")
	public String select2(Model model) {
		model.addAttribute("color", "yellow");
		return "exam/test3";
	}

	@PostMapping("exam/test3")
	public String select2(Model model,String color) {
		model.addAttribute("color", color);
		System.out.println(color);
		return "exam/test3";
	}
}
