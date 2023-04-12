package guru.springframework.petclinicapp.model;

import java.io.Serializable;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

public class BaseEntity implements Serializable{

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
