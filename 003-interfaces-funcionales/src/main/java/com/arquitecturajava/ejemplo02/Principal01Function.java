package com.arquitecturajava.ejemplo02;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01Function {
	
	// Una interfaz funcional Function dispone de un método (apply) que recibe un parámetro y retorna un valor

	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lstPersonas = servicio.buscarTodos();
		// la primera parte usa un function y la segunda un consumer
//		lstPersonas.stream().map(p -> p.getNombre()).forEach(System.out::println);
		
		Function<Persona, String> mapeoNombre = p -> p.getNombre();
		Consumer<String> consumer = System.out::println;
		lstPersonas.stream().map(mapeoNombre).forEach(consumer);
		
		System.out.println("*** Nombres mayúsculas / andThen ***");
		Function<String, String> funcUpperCase = String::toUpperCase;	
		Function<Persona, String> funcCombinado = mapeoNombre.andThen(funcUpperCase);
		lstPersonas.stream().map(funcCombinado).forEach(consumer);
		
		System.out.println("*** Nombres mayúsculas / compose ***");
		// el método compose ejecuta en orden contrario a andThen, en este caso ejecuta lo mismo
		Function<Persona, String> funcCompose = funcUpperCase.compose(mapeoNombre);
		lstPersonas.stream().map(funcCompose).forEach(consumer);
		
		// el método apply es el que se ejecuta al momento de ejecutar el function
		System.out.println("*** Utilizando el método apply ***");
		Function<Persona, String> mapeoApellidos = p -> p.getApellidos();
//		System.out.println(mapeoApellidos.apply(new Persona("Raul", "Lopez", 45)));
		Consumer<String> consuImpresion = System.out::println;
		consuImpresion.accept(mapeoApellidos.apply(new Persona("Raul", "Lopez", 45)));
		
		
		
	}

}
