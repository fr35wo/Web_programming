package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Mid2Controller {
	@GetMapping("mid/test2")
	public String test2(Model model) {
		model.addAttribute("number1", "two");
		model.addAttribute("number2", "three");
		model.addAttribute("result", true);
		return "mid/test2";
	}

	@PostMapping("mid/test2")
	public String test2(Model model,String number1,String number2,Boolean result) {
		model.addAttribute("number1", number1);
		model.addAttribute("number2", number2);
		model.addAttribute("result", result);
		return "mid/test2";
	}
}
