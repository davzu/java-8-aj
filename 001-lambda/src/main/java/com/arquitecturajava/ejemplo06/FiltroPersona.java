package com.arquitecturajava.ejemplo06;

import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public interface FiltroPersona extends Predicate<Persona> {
	
	public static Predicate<Persona> orMultiple(Predicate<Persona> ...predicados) {
		
		Predicate<Persona> combinarPredicados = predicados[0];
		
		for (Predicate<Persona> predicado : predicados) {
			combinarPredicados = combinarPredicados.or(predicado);
		}
		
		return combinarPredicados;
	}

}
