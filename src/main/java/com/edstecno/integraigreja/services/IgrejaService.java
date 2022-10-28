package com.edstecno.integraigreja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edstecno.integraigreja.entities.Igreja;
import com.edstecno.integraigreja.repositories.IgrejaRepository;

@Service
public class IgrejaService {

	@Autowired
	private IgrejaRepository repository;

	public List<Igreja> findAll() {
		return repository.findAll();
	}

	public Igreja findById(Long id) {
		Optional<Igreja> obj = repository.findById(id);
		return obj.get();
	}

	public Igreja insert(Igreja obj){
		return repository.save(obj);
	}

}
