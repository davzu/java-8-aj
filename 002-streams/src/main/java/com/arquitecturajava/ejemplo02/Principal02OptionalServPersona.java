package com.arquitecturajava.ejemplo02;

import java.util.Optional;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona2;

public class Principal02OptionalServPersona {

	public static void main(String[] args) {
		ServicioPersona2 servicio = new ServicioPersona2();
		Persona persona = servicio.buscarPorNombre("david");
		
		if(persona != null) {
			System.out.println(persona.getApellidos());
		}
		
		Optional<Persona> opt = servicio.buscarPorNombre2("gema");
		
		if(opt.isPresent()) {
			System.out.println(opt.get().getApellidos());
		}
	}

}
