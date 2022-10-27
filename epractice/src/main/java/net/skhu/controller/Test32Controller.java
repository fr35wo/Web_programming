//package net.skhu.controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import net.skhu.dto.Product;
//
//@Controller
//public class Test32Controller {
//	@GetMapping("exam3/test2")
//	public String edit(Model model) {
//		return "exam3/test2";
//	}
//
//	@PostMapping("exam3/test2")
//	public String edit(Model model, HttpSession session,Product product
//			 ) {
//		String errorMsg = null;
//		if (name.getNmae() == null || name.getNmae().length() == 0)
//			errorMsg = "제품명을 입력하세요";
//		else if (price.getPrice() == null)
//			errorMsg = "가격을 입력하세요";
//		else if (many.getMany() == null)
//			errorMsg = "수량을 입력하세요";
//
//		else {
//			session.setAttribute("price", price);
//			session.setAttribute("name", name);
//			session.setAttribute("many", many);
//
//			session.setAttribute("result", result(price,many));
//			return "redirect:test2_success";
//		}
//		model.addAttribute("price", price);
//		model.addAttribute("name", name);
//		model.addAttribute("many", many);
//
//		model.addAttribute("errorMsg", errorMsg);
//		return "exam3/test2";
//	}
//
//	@RequestMapping("exam3/test2_success")
//	public String edit_success(Model model) {
//
//		return "exam3/test2_success";
//	}
//
//	public int result(int price,int many) {
//		return price*many;
//	}
//}
