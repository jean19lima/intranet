package com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sistema.service.IPersonaService;

@Controller
public class PersonaController {

	@Autowired
	private IPersonaService personaService;
	
	@GetMapping(value = "/nombre")
	public String getName(Model model) {
		model.addAttribute("name", personaService.getName());
		return "nameView";
	}
}
