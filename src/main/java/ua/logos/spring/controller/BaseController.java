package ua.logos.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/profile")
	public String showProfile(Model model) {
		model.addAttribute("name", "Markiyan");
		return "profile";
	}
	
	@GetMapping("/edit")
	public String showEdit(){
		return "edit";
	}
	
	@GetMapping("/delete")
	public String showDelete() {
		return "delete";
	}
	
}
