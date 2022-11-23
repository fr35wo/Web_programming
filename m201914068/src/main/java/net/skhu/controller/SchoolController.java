package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.SchoolMapper;

@Controller
public class SchoolController {

	@Autowired SchoolMapper schoolMapper;

	@RequestMapping("room/list")
	 public String list(Model model) {
	 model.addAttribute("schools", schoolMapper.findAll());
	 return "room/list";
	 }

	 @RequestMapping("room/detail")
	 public String detail(Model model, Integer id) {
	 if (id == null) id = 2;
	 model.addAttribute("school", schoolMapper.findById(id));
	 return "room/detail";
	 }
}
