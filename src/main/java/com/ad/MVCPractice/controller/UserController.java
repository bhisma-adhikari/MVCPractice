package com.ad.MVCPractice.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value = "/login")
	public String login(HttpServletResponse response) {
		return "login"; // name of .jsp view
	}

	@RequestMapping(value = "/signup")
	public String signup(HttpServletResponse response) {
		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String registerconfirmation(HttpServletRequest request, Model model) throws IOException {
		// the name of the view
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		model.addAttribute("firstName", firstName); 
		model.addAttribute("lastName", lastName); 
		model.addAttribute("username", username); 
		model.addAttribute("passowrd", password);
		
		System.out.println(firstName);
		System.out.println(model);
		
		// add user to database 
		
		return "signup-result"; 
	}

}
