package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
	@RequestMapping("/perkalian")
	public String hitungPerkalian(
			@RequestParam(value = "a", required = false, defaultValue = "0") String a,
			@RequestParam(value = "b", required = false, defaultValue = "0") String b,
			Model model) {
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("hasil", Integer.valueOf(a) * Integer.valueOf(b));
		return "perkalian";
	}
}
