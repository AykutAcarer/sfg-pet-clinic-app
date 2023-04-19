package guru.springframework.petclinicapp.services.map;

import java.util.Set;

import guru.springframework.petclinicapp.model.Vet;
import guru.springframework.petclinicapp.services.CrudService;
import guru.springframework.petclinicapp.services.VetService;

/**
 *@author Aykut Acarer
 *created on 15.04.2023
**/

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
