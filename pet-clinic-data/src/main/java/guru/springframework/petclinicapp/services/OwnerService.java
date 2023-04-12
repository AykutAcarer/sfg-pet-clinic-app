package guru.springframework.petclinicapp.services;

import guru.springframework.petclinicapp.model.Owner;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
	
}
