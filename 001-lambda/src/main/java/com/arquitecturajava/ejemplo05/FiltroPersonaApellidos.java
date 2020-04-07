package com.arquitecturajava.ejemplo05;

import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaApellidos implements Predicate<Persona> {
	
	private String apellidos;

	public FiltroPersonaApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public boolean test(Persona persona) {
		if(persona.getApellidos().equalsIgnoreCase(apellidos)) {
			return true;
		} else {
			return false;
		}
	}

}
