package com.arquitecturajava.ejemplo02;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal01Filtro {

	public static void main(String[] args) {

		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 30));
		
//		List<Persona> lstFiltro = buscarPersonaPorNombre("Pedro", lstPersonas);
		List<Persona> lstFiltro = buscarPersonaPorApellido("Blanco", lstPersonas);

		for (Persona p : lstFiltro) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}

	public static List<Persona> buscarPersonaPorNombre(String nombre, List<Persona> lstPersona) {
		List<Persona> lstFiltro = new ArrayList<>();

		for (Persona p : lstPersona) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				lstFiltro.add(p);
			}
		}

		return lstFiltro;
	}
	
	public static List<Persona> buscarPersonaPorApellido(String apellido, List<Persona> lstPersona) {
		List<Persona> lstFiltro = new ArrayList<>();

		for (Persona p : lstPersona) {
			if (p.getApellidos().equalsIgnoreCase(apellido)) {
				lstFiltro.add(p);
			}
		}

		return lstFiltro;
	}

}
