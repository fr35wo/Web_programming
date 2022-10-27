package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mid4Controller {
	@GetMapping("mid/test4")
	public String test4(Model model) {

		return "mid/test4";
	}

	@PostMapping("mid/test4")
	public String test4(Model model, String title,  String author, String lable, int type, HttpSession session) {


		String errorMsg = null;
		if (title == null || title.length() == 0)
			errorMsg = "제목을 입력하세요";
		else if (author == null || author.length() == 0)
			errorMsg = "작가를 입력하세요";
		else if (lable == null || lable.length() == 0)
			errorMsg = "출판사를 입력하세요";
		else {
			session.setAttribute("title", title);
			session.setAttribute("author", author);
			session.setAttribute("lable", lable);
			session.setAttribute("type", type);
			return "redirect:test4_success";
		}
		model.addAttribute("title", title);
		model.addAttribute("author", author);
		model.addAttribute("lable", lable);
		model.addAttribute("type", type);
		model.addAttribute("errorMsg", errorMsg);
		return "mid/test4";
	}

	@RequestMapping("mid/test4_success")
	public String test4_success(Model model) {
		return "mid/test4_success";
	}
}
