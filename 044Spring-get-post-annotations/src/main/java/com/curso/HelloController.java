package com.curso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("demo")
public class HelloController {

	@GetMapping("/")
	public String getMapping1(ModelMap model) {
		model.addAttribute("message", "Hola caracola");
		return "hello";
	}

	@GetMapping(value = "getMapping")
	public String getMapping(ModelMap model) {
		model.addAttribute("message", "This is Get Method using @GetMapping annotation..!");
		return "hello";
	}

	@PostMapping(value = "postMapping")
	public String postMapping(ModelMap model) {
		model.addAttribute("message", "This is Post Method using @PostMapping annotation..!");
		return "hello";
	}
	
	@RequestMapping("getpost")
	public String postMapping2(ModelMap model) {
		model.addAttribute("message", "222222 This is Post Method using @PostMapping annotation..!");
		return "hello";
	}
	
}