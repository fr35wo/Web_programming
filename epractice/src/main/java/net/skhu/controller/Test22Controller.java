package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test22Controller {
	@GetMapping("exam2/test2")
	public String test2(Model model) {
		model.addAttribute("now", new Date());
		return "exam2/test2";
	}
}
