package com.arquitecturajava.ejemplo07;

import java.util.Arrays;
import java.util.List;

import com.arquitecturajava.dominio.Documento2;
import com.arquitecturajava.dominio.Versionable;

public class Principal01DefaultMethod {

	public static void main(String[] args) {
		Documento2 d1 = new Documento2("java", 1);
		Documento2 d2 = new Documento2("python", 1);
		Documento2 d3 = new Documento2("java", 2);
		Documento2 d4 = new Documento2("net", 1);
		List<Documento2> lstDocumentos = Arrays.asList(d1, d2, d3, d4);
		
		d1.esMayor(d2);
		
		Documento2 mayor = lstDocumentos.stream().reduce(d1, Versionable::esMayor);
		System.out.println(mayor.getTitulo());
		System.out.println(mayor.getVersion());
		
	}

}
