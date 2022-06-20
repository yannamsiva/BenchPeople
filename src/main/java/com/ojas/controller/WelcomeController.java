package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String sayHello(@RequestParam("name")    String name,Model model)
	{
		String msg="Welcome Boss";
		model.addAttribute("msg", name);
		return "welcome.jsp";
	}
}
