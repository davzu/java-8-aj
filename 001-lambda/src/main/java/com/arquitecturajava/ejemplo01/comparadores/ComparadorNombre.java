package com.arquitecturajava.ejemplo01.comparadores;

import java.util.Comparator;

import com.arquitecturajava.dominio.Persona;

public class ComparadorNombre implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.getNombre().compareTo(persona2.getNombre());
	}

}
