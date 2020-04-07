package com.arquitecturajava.ejemplo01;

import java.util.List;
import java.util.function.Consumer;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01Consumer {
	
	// Una interfaz funcional Consumer dispone de un m�todo (accept) que recibe un par�metro pero no retorna ning�n valor
	// por ejemplo la impresi�n por consola o la generaci�n de un fichero

	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lstPersonas = servicio.buscarTodos();
		
		System.out.println("*** Nombres ***");
//		lstPersonas.stream().forEach(p -> System.out.println(p.getNombre()));
		Consumer<Persona> consumerNombre = p -> System.out.println(p.getNombre());
		lstPersonas.stream().forEach(consumerNombre);
		
		System.out.println("*** Apellidos ***");
//		lstPersonas.stream().forEach(Principal01Consumer::imprimirApellidos);
		Consumer<Persona> consumerApellidos = Principal01Consumer::imprimirApellidos;
		lstPersonas.stream().forEach(consumerApellidos);
		
		System.out.println("*** Nombres y Apellidos");
		Consumer<Persona> consumerCombinado = consumerNombre.andThen(consumerApellidos);
		lstPersonas.stream().forEach(consumerCombinado);
		
		// el m�todo accept es el que se ejecuta al momento de ejecutar el consumer
		System.out.println("*** Utilizando m�todo accept ***");
		consumerCombinado.accept(new Persona("Jose", "Perez", 35));
	}
	
	public static void imprimirApellidos(Persona persona) {
		System.out.println(persona.getApellidos());
	}
	

}
