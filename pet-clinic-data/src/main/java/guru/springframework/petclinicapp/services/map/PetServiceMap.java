package guru.springframework.petclinicapp.services.map;

import java.util.Set;

import guru.springframework.petclinicapp.model.Pet;
import guru.springframework.petclinicapp.services.CrudService;

/**
 *@author Aykut Acarer
 *created on 15.04.2023
**/

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	
	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
