package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@GetMapping("product/edit")
	public String edit(Model model) {
		return "product/edit";
	}

	@PostMapping("product/edit")
	public String edit(Model model, HttpSession session, String name, Integer price, Integer many,
			 int category) {
		String errorMsg = null;
		if (name == null || name.length() == 0)
			errorMsg = "제품명을 입력하세요";
		else if (price == null)
			errorMsg = "가격을 입력하세요";
		else if (many == null)
			errorMsg = "수량을 입력하세요";
		else if (category == 0 )
			errorMsg = "카테고리을 선택하세요";
		else {
			session.setAttribute("price", price);
			session.setAttribute("name", name);
			session.setAttribute("many", many);
			session.setAttribute("category", category);
			session.setAttribute("result", result(price,many));
			return "redirect:edit_success";
		}
		model.addAttribute("price", price);
		model.addAttribute("name", name);
		model.addAttribute("many", many);
		model.addAttribute("category", category);
		model.addAttribute("errorMsg", errorMsg);
		return "product/edit";
	}

	@RequestMapping("product/edit_success")
	public String edit_success(Model model) {

		return "product/edit_success";
	}

	public int result(int price,int many) {
		return price*many;
	}
}
