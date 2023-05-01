package guru.springframework.petclinicapp.model;

import java.util.Set;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public class Owner extends Person{

	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
}
