package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal01Comparable {

	public static void main(String[] args) {
		
		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez",30));
		lstPersonas.add(new Persona("Ana", "Sanchez",40));
		lstPersonas.add(new Persona("Gema", "Blanco",30));
		
		Collections.sort(lstPersonas);
		
		for(Persona p :lstPersonas ) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}
		
	}

}
