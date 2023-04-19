package guru.springframework.petclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.petclinicapp.services.OwnerService;

/**
 *@author Aykut Acarer
 *created on 15.04.2023
**/
@RequestMapping("/owners")
@Controller
public class OwnerController {

	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/", "/ownerlist", "/ownerlist.html"})
	public String listOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		return "owners/ownerlist";
	}
}
