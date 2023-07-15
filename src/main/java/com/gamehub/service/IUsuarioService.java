package com.gamehub.service;

import java.util.Optional;

import com.gamehub.model.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findById(Integer id);
	
}
