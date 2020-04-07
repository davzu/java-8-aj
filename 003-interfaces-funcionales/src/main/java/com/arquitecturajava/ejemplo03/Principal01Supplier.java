package com.arquitecturajava.ejemplo03;

import java.util.function.Supplier;

import com.arquitecturajava.dominio.Persona;

public class Principal01Supplier {
	
	// El Supplier devuelve algo sin recibir ningún parámetro

	public static void main(String[] args) {
		Supplier<Persona> obtenerPersona = () -> new Persona("Juan", "Gomez", 20);
		Persona persona = obtenerPersona.get();
		System.out.println(persona);
		
		ServicioFirma servFirma = new ServicioFirma(persona);
		Supplier<String> s = servFirma::obtenerFirma;
//		System.out.println(servFirma.obtenerFirma());
		System.out.println("Imprimiendo página 1");
		System.out.println(s.get());
		System.out.println("Imprimiendo página 2");
		System.out.println(s.get());
		System.out.println("Imprimiendo página 3");
		System.out.println(s.get());
		System.out.println("Imprimiendo página 4");
		System.out.println(s.get());
		
	}

}
