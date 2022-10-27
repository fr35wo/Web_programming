package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@GetMapping("exam2/book")
	public String book(Model model) {
		return "exam2/book";
	}

	@PostMapping("exam2/book")
	public String book(Model model, HttpSession session, String title, String name,
		 String lable,String category) {
		String errorMsg = null;
		if (title == null || title.length() == 0)
			errorMsg = "제목을 입력하세요";
		else if (name == null || name.length() == 0)
			errorMsg = "저자를 입력하세요";
		else if (lable == null || lable.length() == 0)
			errorMsg = "출판사를 입력하세요";
		else if (category == null)
			errorMsg = "카테고리를 입력하세요";
		else {
			session.setAttribute("title", title);
			session.setAttribute("name", name);
			session.setAttribute("lable", lable);
			session.setAttribute("category", category);
			return "redirect:book_success";
		}
		model.addAttribute("title", title);
		model.addAttribute("name", name);
		model.addAttribute("lable", lable);
		model.addAttribute("category", category);
		model.addAttribute("errorMsg", errorMsg);
		return "exam2/book";
	}

	@RequestMapping("exam2/book_success")
	public String book_success(Model model) {
		return "exam2/book_success";
	}
}
