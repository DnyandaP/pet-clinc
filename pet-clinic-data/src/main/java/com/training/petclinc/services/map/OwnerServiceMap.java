package com.training.petclinc.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.training.petclinc.model.Owner;
import com.training.petclinc.services.OwnerService;

@Service
public class OwnerServiceMap  extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		
		return super.finaAll();
	}

	@Override
	public Owner save(Owner object) {
		
		return super.save(object);
	}

	@Override
	public Owner findById(Long id) {
		
		return super.findByIdd(id);
	}

	@Override
	public void delete(Owner object) {
		super.deleted(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByIdd(id);
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
