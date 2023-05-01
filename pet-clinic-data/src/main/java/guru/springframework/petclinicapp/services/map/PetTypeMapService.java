package guru.springframework.petclinicapp.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;
import guru.springframework.petclinicapp.model.PetType;
import guru.springframework.petclinicapp.services.PetTypeService;

/**
 *@author Aykut Acarer
 *created on 01.05.2023
**/

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	

}
