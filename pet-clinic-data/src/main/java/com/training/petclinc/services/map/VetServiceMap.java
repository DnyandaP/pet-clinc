package com.training.petclinc.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.training.petclinc.model.Vet;
import com.training.petclinc.services.VetService;

@Service
public class VetServiceMap  extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Set<Vet> findAll() {
		
		return super.finaAll();
	}

	@Override
	public Vet save(Vet object) {
		
		return super.save(object);
	}

	@Override
	public Vet findById(Long id) {
		
		return super.findByIdd(id);
	}

	@Override
	public void delete(Vet object) {
		super.deleted(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByIdd(id);
		
	}

}
