package com.arquitecturajava.ejemplo02;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Persona;

public class Principal04MetodoReferencia {

	public static void main(String[] args) {

		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 30));
		lstPersonas.add(new Persona("Antonio", "Perez", 70));
		
		List<Persona> lstFiltro = buscarPersonaConFiltro(Persona::estaJubilado, lstPersonas);

		for (Persona p : lstFiltro) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}

	public static List<Persona> buscarPersonaConFiltro(FiltroPersona filtro, List<Persona> lstPersona) {
		List<Persona> lstFiltro = new ArrayList<>();

		for (Persona p : lstPersona) {
			if (filtro.test(p)) {
				lstFiltro.add(p);
			}
		}

		return lstFiltro;
	}

}
