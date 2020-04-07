package com.arquitecturajava.ejemplo03;

import java.util.function.Supplier;

import com.arquitecturajava.dominio.Persona;

public class Principal01Supplier {
	
	// El Supplier devuelve algo sin recibir ning�n par�metro

	public static void main(String[] args) {
		Supplier<Persona> obtenerPersona = () -> new Persona("Juan", "Gomez", 20);
		Persona persona = obtenerPersona.get();
		System.out.println(persona);
		
		ServicioFirma servFirma = new ServicioFirma(persona);
		Supplier<String> s = servFirma::obtenerFirma;
//		System.out.println(servFirma.obtenerFirma());
		System.out.println("Imprimiendo p�gina 1");
		System.out.println(s.get());
		System.out.println("Imprimiendo p�gina 2");
		System.out.println(s.get());
		System.out.println("Imprimiendo p�gina 3");
		System.out.println(s.get());
		System.out.println("Imprimiendo p�gina 4");
		System.out.println(s.get());
		
	}

}
