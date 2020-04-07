package com.arquitecturajava.ejemplo03;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal01FlatMap {

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
		
//		lstPersonas.stream().map(Persona::getNombre).forEach(System.out::println);
		
		// impresión de los deportes que practican
//		lstPersonas
//			.stream()
//			.forEach(p-> p.getLstDeportes()
//										.stream()
//										.map(Deporte::getNombre)
//										.forEach(System.out::println));
		
		// impresión de los deportes que practican con flatMap
		lstPersonas
			.stream()
			.flatMap(p-> p.getLstDeportes().stream())
			.map(Deporte::getNombre)
			.distinct()
			.forEach(System.out::println);
		
		// total número de horas que se practica un deporte
		int totalHoras = lstPersonas
							.stream()
							.flatMap(p-> p.getLstDeportes().stream())
							.filter(d-> d.getNombre().equalsIgnoreCase("padel"))
							.mapToInt(Deporte::getHoras)
							.sum();
		
		System.out.println(totalHoras);
		
		
	}

}
