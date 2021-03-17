package com.corigo.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corigo.pma.deo.EmployeeRepository;
import com.corigo.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRep ;
	
	@GetMapping("/new")
	public String displayEmployeeFrom(Model model) {
		
		Employee anEmployee = new Employee();
		model.addAttribute("employee", anEmployee);
		return "new-employee";

	}
	
	@PostMapping("/save")
	public String createEmployee(Model model, Employee employee) {
		//Save to database using an employee crud repository 
		empRep.save(employee);
		return "redirect:/employees/new" ; 
		
	}

}
