package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test31Controller {
	@GetMapping("exam3/test1")
	public String test2(Model model) {
		model.addAttribute("number", "201914068");
		model.addAttribute("name", "홍석현");
		return "exam3/test1";
	}

	@PostMapping("exam3/test1")
	public String test2(Model model, String name,String number) {

		model.addAttribute("number", "222222222");
		model.addAttribute("name", "임꺽정");
		return "exam3/test1";
	}
}
