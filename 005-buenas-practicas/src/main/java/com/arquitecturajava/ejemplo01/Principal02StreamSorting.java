package com.arquitecturajava.ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Factura;

public class Principal02StreamSorting {

	public static void main(String[] args) {
		List<Factura> lstFacturas = new ArrayList<>();
		Factura factura;
		
		for (int i = 0; i < 1000000; i++) {
			factura = new Factura(i, "concepto" + i, Math.round(Math.random() * 10000));
			lstFacturas.add(factura);
		}
		
		long t1 = System.currentTimeMillis();
		List<Double> nueva = lstFacturas.stream().map(Factura::getImporte).collect(Collectors.toList());
		long t2 = System.currentTimeMillis();
		
		System.out.println(t2 - t1);
		
		List<Double> nueva3 = lstFacturas.stream().map(Factura::getImporte).collect(Collectors.toList());
		
		long t3 = System.currentTimeMillis();
		List<Double> nueva2 = lstFacturas.stream().sorted().map(Factura::getImporte).collect(Collectors.toList());
		long t4 = System.currentTimeMillis();
		
		System.out.println(t4 - t3);
	}

}
