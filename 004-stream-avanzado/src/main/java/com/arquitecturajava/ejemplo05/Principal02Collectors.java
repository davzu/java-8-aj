package com.arquitecturajava.ejemplo05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Deporte;
import com.arquitecturajava.dominio.Persona;

public class Principal02Collectors {

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
		
		persona = new Persona("Pedro", "Marquez", 40);
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
		
		// si tenemos elementos repetidos en la lista y lo pasamos a un mapa dará una excepción
		Map<String, Persona> mapPersonas = lstPersonas
												.stream()
												.collect(Collectors.toMap(Persona::getNombre, p-> p));
		
		mapPersonas.get("Pedro").getLstDeportes().stream().map(Deporte::getNombre).forEach(System.out::println);
		
	}

}
