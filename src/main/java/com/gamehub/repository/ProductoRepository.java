package com.gamehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamehub.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
		
}
