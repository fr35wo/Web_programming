package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test24Controller {
	@GetMapping("exam2/test4")
	public String test4(Model model) {
		model.addAttribute("color1", "yellow");
		model.addAttribute("color2", "red");
		return "exam2/test4";
	}

	@PostMapping("exam2/test4")
	public String test4(Model model, String color1, String color2, HttpSession session) {
		String errorMsg = null;
		if (color1 == null || color1.length() == 0)
			errorMsg = "color1을 입력하세요";
		else if (color1.equals(color2) == false)
			errorMsg = "color1 과 color2 불일치";
		else {
			session.setAttribute("color1", color1);
			session.setAttribute("color2", color2);
			return "exam2/test4";
		}
		model.addAttribute("color1",color1);
		model.addAttribute("color2",color2);
		model.addAttribute("errorMsg", errorMsg);
		return "exam2/test4";

	}


}
