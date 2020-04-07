package com.arquitecturajava.ejemplo09;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01TiposBasicos {
	
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		
//		stream.map(n -> n * n).forEach(System.out::println);
		
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lstPersonas = servicio.buscarTodos();
		
		int total = lstPersonas.stream().map(Persona::getEdad).reduce(0, (a,b)-> a + b);
		System.out.println(total);
		
		// optional genérico
		OptionalInt optTotal = lstPersonas.stream().mapToInt(Persona::getEdad).reduce(Integer::sum);
		if(optTotal.isPresent()) {
			System.out.println(optTotal.getAsInt());
		}
		
		lstPersonas.stream().mapToInt(Persona::getEdad).reduce(Integer::sum).ifPresent(System.out::println);
		
		
	}

}
