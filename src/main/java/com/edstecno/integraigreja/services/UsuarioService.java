package com.edstecno.integraigreja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edstecno.integraigreja.entities.Usuario;
import com.edstecno.integraigreja.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario findById(Long id){
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();
	}

	public Usuario insert(Usuario usuario){
		return repository.save(usuario);
	}

	public void deleteById(Long id){
		repository.deleteById(id);
	}

}
