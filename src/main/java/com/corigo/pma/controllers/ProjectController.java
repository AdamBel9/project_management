package com.corigo.pma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corigo.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@RequestMapping("/new")
	public String displayProjectForm(Model model) {
		model.addAttribute("project", new Project());
		return "new-project";
	}
	
}
