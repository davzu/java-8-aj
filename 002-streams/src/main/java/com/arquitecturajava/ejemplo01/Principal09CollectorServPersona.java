package com.arquitecturajava.ejemplo01;

import java.util.List;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal09CollectorServPersona {

	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lstPersona = servicio.buscarTodosJubilados();
		lstPersona.forEach(System.out::println);
	}


}
