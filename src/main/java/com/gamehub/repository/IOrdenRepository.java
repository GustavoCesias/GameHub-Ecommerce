package com.gamehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamehub.model.Orden;


@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{

	
	
}
