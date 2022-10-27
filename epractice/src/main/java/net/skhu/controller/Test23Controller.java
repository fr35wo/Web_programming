package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Test23Controller {
	@GetMapping("exam2/test3")
	public String test3() {


		return "exam2/test2";
	}
	@PostMapping("exam2/test3")
	public String test3(Model model) {

			return "redirect:exam2/test2";
	}

	@RequestMapping("exam2/test2")
	public String test2(Model model) {

		return "exam2/test2";
	}
}
