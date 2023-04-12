package guru.springframework.petclinicapp.model;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public class PetType extends BaseEntity{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
