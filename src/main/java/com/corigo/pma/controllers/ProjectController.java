package com.corigo.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corigo.pma.deo.ProjectRepository;
import com.corigo.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectRepository proRep ;

	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		model.addAttribute("project", new Project());
		return "new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project , Model model) {
		proRep.save(project );
		//use redirect to prevent duplicate submissions 
		return "redirect:/projects/new" ;
	}
	
	
}
