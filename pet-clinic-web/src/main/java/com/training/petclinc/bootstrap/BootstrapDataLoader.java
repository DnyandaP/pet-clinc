package com.training.petclinc.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.training.petclinc.model.Owner;
import com.training.petclinc.model.Vet;
import com.training.petclinc.services.OwnerService;
import com.training.petclinc.services.VetService;

@Component
public class BootstrapDataLoader implements CommandLineRunner {

	OwnerService ownerService;
	VetService vetService;
	
	
	public BootstrapDataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}


	@Override
	public void run(String... args) throws Exception {
		Owner own1 = new Owner();
		own1.setFirstName("Harry");
		own1.setLastName("Potter");
		
		
		Owner own2 = new Owner();
		own2.setFirstName("Ron");
		own2.setLastName("Weasley");
		
		ownerService.save(own1);
		ownerService.save(own2);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Hermione");
		vet1.setLastName("Granger");
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Draco");
		vet2.setLastName("Malfoy");
		
		vetService.save(vet1);
		vetService.save(vet2);
		System.out.println("Loaded Data");
	}

}
