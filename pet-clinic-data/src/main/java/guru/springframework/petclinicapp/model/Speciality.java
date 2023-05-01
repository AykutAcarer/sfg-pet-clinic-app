package guru.springframework.petclinicapp.model;

/**
 *@author Aykut Acarer
 *created on 01.05.2023
**/

public class Speciality extends BaseEntity{

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
