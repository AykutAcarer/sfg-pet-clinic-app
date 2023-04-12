package guru.springframework.petclinicapp.services;

import java.util.Set;

import guru.springframework.petclinicapp.model.Pet;


/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public interface PetService {

	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
	
}
