package com.training.petclinc.services;

import com.training.petclinc.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
