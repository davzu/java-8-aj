package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal05ExpLambda02 {

	public static void main(String[] args) {

		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 30));

//		lstPersonas.sort(new ComparadorNombre());
//		lstPersonas.sort(new ComparadorApellidos());
		
		// inferencia de tipos, no es necesario que indique el tipo Persona en los parámetros
		// como la expresión lambda debe retornar algo, se obvia la palabra return
		// Este ejemplo reemplaza a la creación de una instancia ComparadorNombre
		lstPersonas.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));

		for (Persona p : lstPersonas) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}

}
