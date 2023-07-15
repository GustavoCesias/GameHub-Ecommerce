package com.gamehub.service;

import java.util.List;

import com.gamehub.model.Orden;

public interface IOrdenService {

	List<Orden> findAll();	
	Orden save (Orden orden);
	String generarNumeroOrden();
	
}
