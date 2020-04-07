package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Factura;

public class Principal01StreamSorting {

	public static void main(String[] args) {
		List<Factura> lstFacturas = new ArrayList<>();
		Factura factura;
		
		for (int i = 0; i < 1000000; i++) {
			factura = new Factura(i, "concepto" + i, Math.round(Math.random() * 10000));
			lstFacturas.add(factura);
		}
		
		lstFacturas.stream().limit(10).sorted().forEach(System.out::println);
	}

}
