package com.arquitecturajava.ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import com.arquitecturajava.dominio.Persona;
import com.arquitecturajava.servicios.ServicioPersona;

public class Principal01MaxMinCount {
	
	public static void main(String[] args) {
		ServicioPersona servicio = new ServicioPersona();
		List<Persona> lstPersonas = servicio.buscarTodos();
		
		int edadTotal = lstPersonas.stream().map(Persona::getEdad).reduce(0, (x,y)-> x + y);
		System.out.println(edadTotal);
		
		int edadMax = lstPersonas.stream().map(Persona::getEdad).reduce(0, (x, y)-> x > y ? x : y);
		System.out.println(edadMax);
		
		int edadMin = lstPersonas.stream().map(Persona::getEdad).reduce(1000, (x, y)-> x < y ? x : y);
		System.out.println(edadMin);
		
		System.out.println("*****************************");
		
		edadTotal = lstPersonas.stream().mapToInt(Persona::getEdad).sum();
		System.out.println(edadTotal);
		
		OptionalInt optEdadMax = lstPersonas.stream().mapToInt(Persona::getEdad).max();
		if(optEdadMax.isPresent()) {
			System.out.println(edadMax);
		}		
		
		OptionalInt optEdadMin = lstPersonas.stream().mapToInt(Persona::getEdad).min();
		if(optEdadMin.isPresent()) {
			System.out.println(edadMin);
		}
		
		long cantPersonas = lstPersonas.stream().mapToInt(Persona::getEdad).count();
		System.out.println(cantPersonas);
		
	}

}
