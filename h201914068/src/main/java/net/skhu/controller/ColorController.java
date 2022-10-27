package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ColorController {
	@GetMapping("exam2/color")
	public String select2(Model model) {
		model.addAttribute("color", "yellow");
		return "exam2/color";
	}

	@PostMapping("exam2/color")
	public String select2(Model model,String color) {
		model.addAttribute("color", color);
		return "exam2/color";
	}
}
