package guru.springframework.petclinicapp.services;

import java.util.Set;

import guru.springframework.petclinicapp.model.Owner;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
}
