package com.arquitecturajava.ejemplo05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.arquitecturajava.dominio.Persona;

public class PrincipalPredicado {

	public static void main(String[] args) {

		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Pedro", "Gomez", 30));
		lstPersonas.add(new Persona("Ana", "Sanchez", 40));
		lstPersonas.add(new Persona("Gema", "Blanco", 30));
		lstPersonas.add(new Persona("Antonio", "Perez", 70));
		
		Predicate<Persona> filtroPedro = new FiltroPersonaNombre("pedro");
		Predicate<Persona> filtroPerezOrJubilado = filtroPedro.or(Persona::estaJubilado);
		
		List<Persona> lstFiltro = buscarPersonaConFiltro(filtroPerezOrJubilado, lstPersonas);
		
		for (Persona p : lstFiltro) {
			System.out.printf("Persona: %s %s %s %n", p.getNombre(), p.getApellidos(), p.getEdad());
		}

	}

	public static List<Persona> buscarPersonaConFiltro(Predicate filtro, List<Persona> lstPersona) {
		List<Persona> lstFiltro = new ArrayList<>();

		for (Persona p : lstPersona) {
			if (filtro.test(p)) {
				lstFiltro.add(p);
			}
		}

		return lstFiltro;
	}

}
