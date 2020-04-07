package com.arquitecturajava.ejemplo02;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaNombre implements FiltroPersona {

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
