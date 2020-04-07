package com.arquitecturajava.ejemplo02;

import java.util.Optional;

import com.arquitecturajava.dominio.Persona;

public class Principal01Optional {

	public static void main(String[] args) {
		Optional<Persona> opt = Optional.empty();
		
		if(opt.isPresent()) {
			System.out.println(opt.get().getNombre());
		}
		
		Optional<Persona> opt2 = Optional.of(new Persona("Juan", "Sanchez", 20));
		
		if(opt.isPresent()) {
			System.out.println(opt.get().getNombre());
		}
	}
	
	
	
}
