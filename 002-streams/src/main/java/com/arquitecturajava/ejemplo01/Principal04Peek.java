package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.arquitecturajava.dominio.Persona;

public class Principal04Peek {

	public static void main(String[] args) {
		List<Persona> lstPersonas = new ArrayList();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 20));
		lstPersonas.add(new Persona("David", "Alvarez", 70));

		Stream<Persona> miStream = lstPersonas.stream();
		
		miStream
		.peek(System.out::println)
		.filter((Persona p) -> p.getEdad() > 20)
		.peek(System.out::println)
		.forEach(Principal04Peek::imprimir);
	}

	public static void imprimir(Persona p) {
		System.out.println("***************");
		System.out.println(p.getNombre());
		System.out.println("***************");
	}

}
