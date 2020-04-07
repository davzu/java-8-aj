package com.arquitecturajava.ejemplo06;

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
		lstPersonas.add(new Persona("Jose", "Jimenez", 32));
		
		Predicate<Persona> filtroPedro = new FiltroPersonaNombre("pedro");
		Predicate<Persona> filtroJubilado = filtroPedro.or(Persona::estaJubilado);
		Predicate<Persona> filtroJimenez = new FiltroPersonaApellidos("jimenez");
		
		List<Persona> lstFiltro = buscarPersonaConFiltro(FiltroPersona.orMultiple(filtroPedro, 
																				filtroJubilado,
																				filtroJimenez), lstPersonas);
		
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
