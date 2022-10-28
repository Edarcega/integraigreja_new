package com.edstecno.integraigreja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edstecno.integraigreja.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
