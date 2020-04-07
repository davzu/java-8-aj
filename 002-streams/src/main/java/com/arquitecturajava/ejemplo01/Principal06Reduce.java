package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal06Reduce {

	public static void main(String[] args) {
		List<Persona> lstPersonas = new ArrayList();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));
		lstPersonas.add(new Persona("David", "Alvarez", 70));

		Stream<Persona> miStream = lstPersonas.stream();
		
		int resultado = miStream
							.mapToInt((Persona p) -> p.getEdad())
							.reduce(0, (int edad1, int edad2) -> edad1 + edad2);
		
		System.out.println(resultado);
		
		// reduce con filtro que no toma ningún valor, tomará el valor del inicializador
		Stream<Persona> miStream2 = lstPersonas.stream();
		
		resultado = miStream2
							.mapToInt((Persona p) -> p.getEdad())
							.filter((int edad) -> edad > 80)
							.reduce(0, (int edad1, int edad2) -> edad1 + edad2);
		
		System.out.println(resultado);
				
	}
	
	public static void imprimir(int x) {
		System.out.println(x);
	}


}
