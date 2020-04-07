package com.arquitecturajava.ejemplo06;

import java.util.Arrays;
import java.util.List;

import com.arquitecturajava.dominio.Documento;

public class Principal01BiFunction {

	public static void main(String[] args) {
		Documento d1 = new Documento("java", 1);
		Documento d2 = new Documento("python", 1);
		Documento d3 = new Documento("java", 2);
		Documento d4 = new Documento("net", 1);
		List<Documento> lstDocumentos = Arrays.asList(d1, d2, d3, d4);
		
		Documento mayor = lstDocumentos.stream().reduce(d1, Documento::esMayor);
		System.out.println(mayor.getTitulo());
		System.out.println(mayor.getVersion());
		
	}

}
