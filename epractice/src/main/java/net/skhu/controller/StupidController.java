package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StupidController {
	@GetMapping("student/stupid")
	public String stupid(Model model) {
		return "student/stupid";
	}

	@PostMapping("student/stupid")
	public String stupid(Model model, HttpSession session, String userid, String name,
		 String email, int departmentId) {
		String errorMsg = null;
		if (userid == null || userid.length() == 0)
			errorMsg = "학번을 입력하세요";
		else if (name == null || name.length() == 0)
			errorMsg = "이름을 입력하세요";
		else if (email == null || email.length() == 0)
			errorMsg = "이메일 주소를 입력하세요";
		else if (departmentId == 0 )
			errorMsg = "전공을 선택하세요";
		else {
			session.setAttribute("userid", userid);
			session.setAttribute("name", name);
			session.setAttribute("email", email);
			session.setAttribute("departmentId", departmentId);
			return "redirect:stupid_success";
		}
		model.addAttribute("userid", userid);
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("departmentId", departmentId);
		model.addAttribute("errorMsg", errorMsg);
		return "student/stupid";
	}

	@RequestMapping("student/stupid_success")
	public String stupid_success(Model model) {
		return "student/stupid_success";
	}
}