package guru.springframework.petclinicapp.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinicapp.model.Owner;
import guru.springframework.petclinicapp.services.OwnerService;

/**
 *@author Aykut Acarer
 *created on 15.04.2023
**/

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	
	
	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

	

	
	

}
