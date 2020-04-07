package com.arquitecturajava.ejemplo01.comparadores;

import java.util.Comparator;

import com.arquitecturajava.dominio.Persona;

public class ComparadorApellidos implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.getApellidos().compareTo(persona2.getApellidos());
	}

}
