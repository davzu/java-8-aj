package com.arquitecturajava.ejemplo05;

import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaNombre implements Predicate<Persona> {

	private String nombre;

	public FiltroPersonaNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean test(Persona persona) {
		if(persona.getNombre().equalsIgnoreCase(nombre)) {
			return true;
		} else {
			return false;
		}
	}

}
