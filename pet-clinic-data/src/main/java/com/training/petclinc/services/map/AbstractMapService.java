package com.training.petclinc.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.petclinc.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

	protected Map<ID,T> map = new HashMap();

	Set<T> finaAll(){
		return new HashSet<T>(map.values());
	}
	
	T findByIdd(ID id) {
		return map.get(id);
	}
	
	T  save(T object) {
		object.setId(getNextId());
		return map.put((ID) object.getId(), object);
	}
	void deleteByIdd(ID id) {
		map.remove(id);
	}
	void deleted(T object) {
		map.entrySet().removeIf(entry->entry.getValue().equals(object));
	}
	
	private Long getNextId() {
		Long nextId = null;
		try {
			nextId= Collections.max(map.keySet()) +1;
		}catch(Exception e) {
			nextId = 1L;
		}
		return nextId;
	}
}
