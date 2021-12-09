package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {
	
	
	@GetMapping(value={"/hola" , "/"})
	public String saludar(Model model) {
		System.out.println("Hola");
		model.addAttribute("mensaje", "Hola");
		return "index";
	}
}
