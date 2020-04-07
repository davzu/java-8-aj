package com.arquitecturajava.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.arquitecturajava.dominio.Persona;

public class ServicioPersona2 {
	
	static List<Persona> lstPersonas = new ArrayList();
	
	static {
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));
		lstPersonas.add(new Persona("David", "Alvarez", 70));
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona persona = lstPersonas.stream()
									.filter((Persona p) -> p.getNombre().equalsIgnoreCase(nombre))
									.findFirst()
									.get();
		
		return persona;
	}
	
	public Optional<Persona> buscarPorNombre2(String nombre) {
		return lstPersonas.stream()
							.filter((Persona p) -> p.getNombre().equalsIgnoreCase(nombre))
							.findFirst();
	}

}
