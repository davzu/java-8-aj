package com.arquitecturajava.ejemplo08;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Documento2;

public class Principal01BiPredicate {

	public static void main(String[] args) {
		Documento2 d1 = new Documento2("java", 1);
		Documento2 d2 = new Documento2("python", 2);
		Documento2 d3 = new Documento2("java", 4);
		Documento2 d4 = new Documento2("net", 3);
		List<Documento2> lstDocumentos = Arrays.asList(d1, d2, d3, d4);
		
		List<Documento2> lstDocNueva = filtrar(lstDocumentos, Principal01BiPredicate::mayorQue, d4);
		
		lstDocNueva.stream().map(Documento2::getTitulo).forEach(System.out::println);
	}
	
	public static List<Documento2> filtrar(List<Documento2> lstDocumentos, 
										BiPredicate<Documento2, Documento2> predicado,
										Documento2 docComparar) {
		return lstDocumentos
				.stream()
				.filter(docInicial -> predicado.test(docInicial, docComparar))
				.collect(Collectors.toList());
	}
	
	public static boolean mayorQue(Documento2 docInicial, Documento2 docComparar) {
		return docInicial.getVersion() > docComparar.getVersion();
	}

}
