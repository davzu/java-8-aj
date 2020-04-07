package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal03ClaseAnonima {

	public static void main(String[] args) {

		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 30));

//		lstPersonas.sort(new ComparadorNombre());
//		lstPersonas.sort(new ComparadorApellidos());
		
		lstPersonas.sort(new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				if (p1.getEdad() == p2.getEdad()) {
					return 0;
				} else if (p1.getEdad() > p2.getEdad()) {
					return 1;
				} else {
					return -1;
				}
			}
		});

		for (Persona p : lstPersonas) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}

}
