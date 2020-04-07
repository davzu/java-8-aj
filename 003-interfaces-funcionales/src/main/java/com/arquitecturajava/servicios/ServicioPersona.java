package com.arquitecturajava.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class ServicioPersona {
	
	public List<Persona> buscarTodos() {
		List<Persona> lstPersonas = new ArrayList();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));
		lstPersonas.add(new Persona("David", "Alvarez", 70));
		
		return lstPersonas;
	}
	
	public List<Persona> buscarTodosJubilados() {
		List<Persona> lstPersonas = new ArrayList();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));
		lstPersonas.add(new Persona("David", "Alvarez", 70));
		
		return lstPersonas
				.stream()
				.filter(Persona::estaJubilado)
				.collect(Collectors.toList());	
	}

}
