package com.arquitecturajava.ejemplo01;

import java.util.List;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01Slicing {

	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lstPersonas = servicio.buscarTodos();
		
//		lstPersonas
//			.stream()
//			.filter(p-> p.getNombre().equalsIgnoreCase("ana"))
//			.map(Persona::getNombre)
//			.forEach(System.out::println);
		
		lstPersonas.stream().skip(2).forEach(Principal01Slicing::mostrarPersona);
		System.out.println("**************");
		lstPersonas.stream().skip(1).limit(2).forEach(Principal01Slicing::mostrarPersona);
		System.out.println("**************");
		// de las 2 personas que obtengo, imprimo las que su edad es mayor a 30
		lstPersonas.stream().skip(1).limit(2).filter(p-> p.getEdad() > 30).forEach(Principal01Slicing::mostrarPersona);
		
	}
	
	public static void mostrarPersona(Persona persona) {
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellidos());
		System.out.println(persona.getEdad());
	}

}
