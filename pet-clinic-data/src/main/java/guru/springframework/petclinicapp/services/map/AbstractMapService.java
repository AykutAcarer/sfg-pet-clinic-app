package guru.springframework.petclinicapp.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.management.RuntimeErrorException;

import guru.springframework.petclinicapp.model.BaseEntity;

/**
 *@author Aykut Acarer
 *created on 13.04.2023
**/

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		
		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextId_());
			}
			
			map.put(object.getId(), object);
		}else {
			throw new RuntimeException("Object cannnot be null");
		}
		
		return object;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry->entry.getValue().equals(object));
	}
	
	private Long getNextId_() {
		Long nextId = null;
		
		try {
			nextId = Collections.max(map.keySet()) +1; 
		}catch(NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}
	
}
