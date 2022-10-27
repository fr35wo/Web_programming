package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test2Controller {
	@GetMapping("exam/test2")
	public String test2(Model model) {
		model.addAttribute("msg", "hello");
		model.addAttribute("now", new Date());
		return "exam/test2";
	}

	@PostMapping("exam/test2")
	public String test2(Model model, String msg) {
		System.out.println(msg);
		System.out.println(new Date());
		model.addAttribute("msg", msg);
		model.addAttribute("now", new Date());
		return "exam/test2";
	}
}
