package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.ejemplo01.comparadores.ComparadorApellidos;
import com.arquitecturajava.ejemplo01.comparadores.ComparadorNombre;

public class Principal02Comparator {

	public static void main(String[] args) {
		
		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez",30));
		lstPersonas.add(new Persona("Ana", "Sanchez",40));
		lstPersonas.add(new Persona("Gema", "Blanco",30));
		
//		lstPersonas.sort(new ComparadorNombre());
		lstPersonas.sort(new ComparadorApellidos());
		
		for(Persona p :lstPersonas ) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}
		
	}

}
