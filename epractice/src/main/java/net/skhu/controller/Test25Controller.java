package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.skhu.dto.Choice;

@Controller
public class Test25Controller {
	@GetMapping("exam2/test5")
	public String test5(Choice choice) {
		choice.setColor1("yellow");
		choice.setColor2("red");
		return "exam2/test5";
	}

	@PostMapping("exam2/test5")
	public String test5(Model model, HttpSession session, Choice choice) {
		String errorMsg = null;
		if (choice.getColor1() == null || choice.getColor1().length() == 0)
			errorMsg = "color1을 입력하세요";
		else if (choice.getColor1().equals(choice.getColor2()) == false)
			errorMsg = "color1 과 color2 불일치";
		else {
			session.setAttribute("color1", choice);
			session.setAttribute("color2", choice);
			return "exam2/test5";
		}
		model.addAttribute("color1", choice);
		model.addAttribute("color2", choice);
		model.addAttribute("errorMsg", errorMsg);
		return "exam2/test5";

	}
}
