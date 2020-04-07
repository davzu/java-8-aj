package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal01Stream {

	public static void main(String[] args) {
		List<Persona> lstPersonas = new ArrayList();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));

//		lstPersonas.forEach((Persona p) -> System.out.println(p.getNombre()));

		Stream<Persona> miStream = lstPersonas.stream();
		miStream.forEach((Persona p) -> {
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
		});
	}

}
