package guru.springframework.petclinicapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@author Aykut Acarer
 *created on 15.04.2023
**/
@RequestMapping("/owners")
@Controller
public class OwnerController {

	@RequestMapping({"","/", "/ownerlist", "/ownerlist.html"})
	public String listOwners() {
		
		return "owners/ownerlist";
	}
}
