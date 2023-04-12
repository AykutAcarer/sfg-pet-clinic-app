package guru.springframework.petclinicapp.services;

import java.util.Set;

/**
 *@author Aykut Acarer
 *created on 13.04.2023
**/

public interface CrudService<T, ID> {

	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);
	
}
