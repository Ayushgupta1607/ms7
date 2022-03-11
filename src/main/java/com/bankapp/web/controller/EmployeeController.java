package com.bankapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.persitance.User;
import com.bankapp.model.service.UserService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("show")
	public ModelAndView showEmployees(ModelAndView mv) {
		mv.setViewName("showemployees");
		List<User> employees=userService.getEmployees();
		System.out.println(employees);
		mv.addObject("employees",employees);
		return mv;
		
	}
	
	@PutMapping("upgradeEmployee")
	public String upgradeEmployye(@RequestParam String id) {
		userService.upgradeEmployee(id);
		return "redirect:success";
	}
}
