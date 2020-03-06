package com.example.demo.controller.swagger;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;



@Controller
@Api(value = "/")
@RequestMapping("/rest")
public class swaggerController {

	@PutMapping("/home")
	public String home() {
		return "greeting";
	}
	
	@GetMapping("/ch")
	public String hotdog() {
		return "greeting";
	}
	
	
	@PostMapping("/tos/{id}")
	public String akj(@RequestParam(name = "name") String name, @RequestParam(value="lastName") String value,Model modelo){
		modelo.addAttribute("par", value);
		modelo.addAttribute("name",name);
		return "greeting";
	}
	
	
	@DeleteMapping("/borrar")
	public String añjbg(@RequestParam(name = "name") String name, Model modelo){
		modelo.addAttribute("name", name);
		return "anofn";
	}
	
	
}
