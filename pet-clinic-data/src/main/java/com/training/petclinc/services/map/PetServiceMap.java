package com.training.petclinc.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.training.petclinc.model.Pet;
import com.training.petclinc.services.PetService;

@Service
public class PetServiceMap  extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Set<Pet> findAll() {
		
		return super.finaAll();
	}

	@Override
	public Pet save(Pet object) {
		
		return super.save(object);
	}

	@Override
	public Pet findById(Long id) {
		
		return super.findByIdd(id);
	}

	@Override
	public void delete(Pet object) {
		super.deleted(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByIdd(id);
		
	}

}
