package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.School;
import net.skhu.mapper.BuildingMapper;
import net.skhu.mapper.SchoolMapper;

@Controller
public class SchoolController {

	@Autowired
	SchoolMapper schoolMapper;
	@Autowired
	BuildingMapper buildingMapper;

	@RequestMapping("room/list")
	public String list(Model model) {
		model.addAttribute("schools", schoolMapper.findAll());
		return "room/list";
	}

	@GetMapping("room/create")
	public String create(Model model) {
		School school = new School();
		model.addAttribute("school", school);
		model.addAttribute("buildings", buildingMapper.findAll());
		return "room/create";
	}

	@PostMapping("room/create")
	public String create(Model model, School school) {
		schoolMapper.insert(school);
		return "redirect:list";
	}

	@GetMapping("room/edit")
	public String edit(Model model, int id) {
		School school = schoolMapper.findById(id);
		model.addAttribute("school", school);
		model.addAttribute("buildings", buildingMapper.findAll());
		return "room/edit";
	}

	@PostMapping("room/edit")
	public String edit(Model model, School school) {
		schoolMapper.update(school);
		return "redirect:list";
	}

	@RequestMapping("room/delete")
	public String delete(int id) {
		schoolMapper.delete(id);
		return "redirect:list";

	}

}
