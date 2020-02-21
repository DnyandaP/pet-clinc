package com.training.petclinc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.petclinc.services.VetService;
@RequestMapping("vets")
@Controller
public class VetController {

	private final VetService vetService;
	
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping({"","/","index","index.html"})
	public String indexPage(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
