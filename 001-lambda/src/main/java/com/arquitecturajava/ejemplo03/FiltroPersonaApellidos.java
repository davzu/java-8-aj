package com.arquitecturajava.ejemplo03;

import com.arquitecturajava.dominio.Persona;

public class FiltroPersonaApellidos implements FiltroPersona {
	
	private String apellidos;

	public FiltroPersonaApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public boolean test(Persona persona) {
		if(persona.getApellidos().equalsIgnoreCase(apellidos)) {
			return true;
		} else {
			return false;
		}
	}

}
