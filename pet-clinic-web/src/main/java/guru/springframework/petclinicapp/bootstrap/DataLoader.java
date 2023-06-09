package guru.springframework.petclinicapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.petclinicapp.model.Owner;
import guru.springframework.petclinicapp.model.PetType;
import guru.springframework.petclinicapp.model.Vet;
import guru.springframework.petclinicapp.services.OwnerService;
import guru.springframework.petclinicapp.services.PetTypeService;
import guru.springframework.petclinicapp.services.VetService;
import guru.springframework.petclinicapp.services.map.OwnerServiceMap;
import guru.springframework.petclinicapp.services.map.VetServiceMap;


/**
 *@author Aykut Acarer
 *created on 19.04.2023
**/

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners....");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Max");
		vet2.setLastName("Core");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets....");
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
	}

	
}
