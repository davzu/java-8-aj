package com.arquitecturajava.ejemplo03;

import com.arquitecturajava.dominio.Persona;

public class ServicioFirma {

	private Persona persona;

	public ServicioFirma(Persona persona) {
		this.persona = persona;
	}

	public String obtenerFirma() {
		return "Firma de la persona: " + persona.getNombre();
	}

}
