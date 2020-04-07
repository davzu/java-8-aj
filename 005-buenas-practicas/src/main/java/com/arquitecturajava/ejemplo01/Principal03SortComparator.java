package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.arquitecturajava.dominio.Factura;

public class Principal03SortComparator {

	public static void main(String[] args) {
		List<Factura> lstFacturas = new ArrayList<>();
		Factura factura;
		
		for (int i = 0; i < 1000000; i++) {
			factura = new Factura(i, "concepto" + i, Math.round(Math.random() * 10000));
			lstFacturas.add(factura);
		}
		
//		lstFacturas.stream().limit(10).sorted(Comparator.comparing(Factura::getConcepto)).forEach(System.out::println);
		
		lstFacturas
			.stream()
			.limit(1000)
			.sorted(Comparator.comparing(Factura::getImporte).thenComparing(Factura::getConcepto).reversed())
			.forEach(System.out::println);
		
	}
	
}
