package com.arquitecturajava.ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.arquitecturajava.dominio.Factura;

public class Principal01ParallelStream {

	public static void main(String[] args) {
		List<Factura> lstFacturas = new ArrayList<>();
		Factura factura;
		
		for (int i = 0; i < 10; i++) {
			factura = new Factura(i, "concepto" + i, Math.round(Math.random() * 10000));
			lstFacturas.add(factura);
		}
		
		long t1 = System.currentTimeMillis();
		
		Optional<Double> opt = lstFacturas
									.parallelStream()
									.map(Factura::getImporte)
									.map(Principal01ParallelStream::duplicar)
									.reduce(Double::sum);
		
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println(t2 - t1);
		
	}
	
	public static double duplicar(double numero) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero * 2;
	}
	
}
