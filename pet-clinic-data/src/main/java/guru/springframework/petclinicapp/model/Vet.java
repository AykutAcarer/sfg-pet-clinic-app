package guru.springframework.petclinicapp.model;

import java.util.Set;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public class Vet extends Person{

	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
	
}
