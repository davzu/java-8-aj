package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal07Collector {

	public static void main(String[] args) {
		List<Persona> lstPersonas = new ArrayList();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));
		lstPersonas.add(new Persona("David", "Alvarez", 70));

		Stream<Persona> miStream = lstPersonas.stream();
		
//		miStream
//		.filter((Persona p) -> p.getEdad() > 30)
//		.forEach(System.out::println);
		
		List<Persona> lstPersonas2 = miStream
										.filter((Persona p) -> p.getEdad() > 30)
										.collect(Collectors.toList());
		
		lstPersonas2.forEach(System.out::println);
	}
	
	public static void imprimir(int x) {
		System.out.println(x);
	}


}
