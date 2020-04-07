package com.arquitecturajava.ejemplo04;

import java.util.List;
import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01Predicate {
	
	// Una interfaz funcional Predicate dispone de un m�todo (test) que recibe un par�metro con el cu�l realizar�
	// una evaluaci�n y retornar� un valor boolean

	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lista = servicio.buscarTodos();
		Predicate<Persona> pPersona = p -> p.getNombre().equalsIgnoreCase("pedro");
		Predicate<Persona> pPersona2 = p -> p.getNombre().equalsIgnoreCase("ana");
		Predicate<Persona> pPersona3 = p -> p.getApellidos().equalsIgnoreCase("sanchez");
		Predicate<Persona> pCombinado = pPersona.or(pPersona2).and(pPersona3.negate());
		
		// Se filtrar�n los nombres que sean Pedro o Ana y cuyo apellido sea diferente a Sanchez
		lista.stream().filter(pCombinado).forEach(System.out::println);
		
	}

}
