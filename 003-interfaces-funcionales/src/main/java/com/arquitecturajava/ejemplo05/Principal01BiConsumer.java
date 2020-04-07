package com.arquitecturajava.ejemplo05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01BiConsumer {
	
	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();
		
//		BiConsumer<Persona, Persona> biConsumidor = (Persona p1, Persona p2) 
//													-> System.out.println(p1.getNombre() + " " + p2.getNombre());													
//		biConsumidor.accept(new Persona("Pepe", "Perez", 20), new Persona("Ana", "Gomez", 30));
													
		Map<String, Persona> mapPersona = lista.stream()
										.collect(Collectors.toMap(Persona::getNombre, persona -> persona));
		
//		mapPersona.forEach((String clave, Persona persona) -> 
//							System.out.printf("El nombres es %s y el apellido es %s %n", clave, persona.getApellidos()));
		
		mapPersona.forEach(Principal01BiConsumer::imprimiMapaPersona);
	}
	
	public static void imprimiMapaPersona(String clave, Persona persona) {
		System.out.printf("El nombres es %s y el apellido es %s %n", clave, persona.getApellidos());
	}

}
