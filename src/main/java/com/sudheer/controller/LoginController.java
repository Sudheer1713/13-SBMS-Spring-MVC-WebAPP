/**
 * 
 */
package com.sudheer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sudheer.bindings.LoginForm;

/**
 * @author Sudheer
 *
 */
@Controller
public class LoginController {

	@GetMapping("/login")
	public String loginPage(Model model) {
		LoginForm loginFormObj = new LoginForm();
		model.addAttribute("loginForm", loginFormObj);
		return "index";
	}

	@PostMapping("/checkLogin")
	public String checkLogin(LoginForm formObj, Model model) {
		if (formObj.getEmail().equals("ashok@gmail.com") && formObj.getPwd().equals("abc@123")) {
			model.addAttribute("msg", "Welcome to Ashok IT application...");
			return "dashboard";
		} else {
			model.addAttribute("msg", "Invalid Credentials");
			return "index";
		}
	}

}
