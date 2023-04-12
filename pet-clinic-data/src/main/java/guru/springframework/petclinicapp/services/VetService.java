package guru.springframework.petclinicapp.services;

import java.util.Set;

import guru.springframework.petclinicapp.model.Vet;




/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public interface VetService {

	Vet findByLastName(String lastName);
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
