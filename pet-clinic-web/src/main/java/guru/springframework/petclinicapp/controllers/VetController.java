package guru.springframework.petclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.petclinicapp.services.VetService;

/**
 *@author Aykut Acarer
 *created on 15.04.2023
**/

@Controller
public class VetController {

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}


	@RequestMapping({"/vets", "/vets/vetlist", "/vets/vetlist.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		return "vets/vetlist";
	}
}
