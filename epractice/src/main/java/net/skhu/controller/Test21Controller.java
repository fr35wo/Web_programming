package net.skhu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test21Controller {
	@RequestMapping("exam2/test1")
	public String test1(String userid, String name,HttpSession session) {
		session.setAttribute("userid", "201914068");
		session.setAttribute("name", "홍석현");
		return "exam2/test1";
	}
}