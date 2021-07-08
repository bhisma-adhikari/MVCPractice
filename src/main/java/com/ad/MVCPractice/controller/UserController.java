package com.ad.MVCPractice.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ad.MVCPractice.model.User;
import com.ad.MVCPractice.service.UserService;
import com.ad.MVCPractice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

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
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// add user to database
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setUsername(username);
		user.setPassword(password);

		System.out.println("User before inserting to db: " + user);

		Integer id = this.userService.insert(user);
		System.out.println("id: " + id);
		model.addAttribute("success", id != null ? true : false);

		model.addAttribute("user", user);

		System.out.println("User after inserting to db: " + user);
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
