package com.arquitecturajava.ejemplo03;

import com.arquitecturajava.dominio.Persona;

public interface FiltroPersona {
	
	public boolean test(Persona persona);
	
	default public FiltroPersona or (FiltroPersona filtro) {
		
		return (Persona p) -> {return test(p) || filtro.test(p);};
	}

}
