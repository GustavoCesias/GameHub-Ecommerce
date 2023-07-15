package com.gamehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamehub.model.Usuario;


@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}
