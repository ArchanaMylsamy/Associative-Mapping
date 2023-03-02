package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.employee;
import com.example.demo.Repository.employeeRepo;

@RestController
public class employeeController {
	@Autowired
	private employeeRepo empRepo;
	
	@PostMapping("/s")
	public String saveDetails(@RequestBody employee e)
	{
		empRepo.save(e);
		return "Data saved";
	}
	
	
}