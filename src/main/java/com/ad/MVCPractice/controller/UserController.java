package com.ad.MVCPractice.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String processSignup(HttpServletRequest request, Model model) throws IOException {
		model.addAttribute("firstName", request.getParameter("firstName"));
		model.addAttribute("lastName", request.getParameter("lastName"));
		model.addAttribute("username", request.getParameter("username"));
		model.addAttribute("password", request.getParameter("password"));
		System.out.println(model);

		// add user to database

		return "signup-result";
	}

//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    public String processSignup(@ModelAttribute("user") User user, Model model) {  // The 'User' class must be @Controller
//        model.addAttribute("user", user);
//        System.out.println(model);
//        System.out.println(user);
//        return "signup-result";
//    }

}
