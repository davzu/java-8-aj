package com.arquitecturajava.ejemplo04;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal01AnyAllNoneMatch {

	public static void main(String[] args) {
		List<Persona> lstPersonas = new ArrayList<>();
		
		Persona persona = new Persona("Juan", "Gomez", 20);
		persona.addDeporte(new Deporte("Padel", 30));
		persona.addDeporte(new Deporte("Natacion", 10));
		lstPersonas.add(persona);
		
		persona = new Persona("Ana", "Blanco", 20);
		persona.addDeporte(new Deporte("Futbol", 20));
		persona.addDeporte(new Deporte("Tenis", 8));
		lstPersonas.add(persona);
		
		persona = new Persona("Pedro", "Marquez", 20);
		persona.addDeporte(new Deporte("Pesas", 20));
		persona.addDeporte(new Deporte("Ciclismo", 10));
		lstPersonas.add(persona);
		
		persona = new Persona("Maria", "Sanchez", 20);
		persona.addDeporte(new Deporte("Ciclismo", 20));
		persona.addDeporte(new Deporte("Padel", 8));
		lstPersonas.add(persona);
		
		persona = new Persona("Gabriel", "Marquez", 50);
		persona.addDeporte(new Deporte("Yoga", 15));
		persona.addDeporte(new Deporte("Ciclismo", 10));
		lstPersonas.add(persona);
		
		persona = new Persona("Maria", "Sanchez", 20);
		persona.addDeporte(new Deporte("Ciclismo", 20));
		persona.addDeporte(new Deporte("Padel", 8));
		lstPersonas.add(persona);
		
		// alguna persona practica m�s de 10 horas de deporte
		// si no cumple, no contin�a evaluando
		boolean cumple = lstPersonas
							.stream()
							.flatMap(p-> p.getLstDeportes().stream())
							.peek(System.out::println)
							.anyMatch(d-> d.getHoras() > 10);
		
		System.out.println(cumple);
		
		// todas las personas practican m�s de 10 horas en cada deporte
		// se eval�an todos
		cumple = lstPersonas
					.stream()
					.flatMap(p-> p.getLstDeportes().stream())
					.allMatch(d-> d.getHoras() > 10);

		System.out.println(cumple);
		
		// ninguna persona practica m�s de 40 horas en cada deporte
		// se eval�an todos
		cumple = lstPersonas
					.stream()
					.flatMap(p-> p.getLstDeportes().stream())
					.noneMatch(d-> d.getHoras() > 40);
		
		System.out.println(cumple);
		
	}

}
