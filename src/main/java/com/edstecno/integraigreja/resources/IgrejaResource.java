package com.edstecno.integraigreja.resources;

import com.edstecno.integraigreja.entities.Igreja;
import com.edstecno.integraigreja.services.IgrejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/igrejas")
public class IgrejaResource {

	@Autowired
	private IgrejaService service;

	@GetMapping
	public ResponseEntity<List<Igreja>> findAll() {
		List<Igreja> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Igreja> findById(@PathVariable Long id) {
		Igreja obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Igreja> insert(@RequestBody Igreja obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

}
