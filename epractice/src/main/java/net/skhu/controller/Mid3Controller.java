package net.skhu.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mid3Controller {
	@RequestMapping("mid/test3")
	public String test1(Model model) {
		model.addAttribute("myName", "");
		model.addAttribute("myNumber", "");
		model.addAttribute("myArea", "");

		return "mid/test3";
	}
	@PostMapping("mid/test3")
	public String test1(Model model, String myName,  String myNumber, String myArea) {
		model.addAttribute("myName", myName);
		model.addAttribute("myNumber", myNumber);
		model.addAttribute("myArea", myArea);
		model.addAttribute("now", new Date());
		return "mid/test3";
	}
}
