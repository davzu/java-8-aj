package com.arquitecturajava.ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

import com.arquitecturajava.dominio.Factura;

public class Principal02Pool {

	public static void main(String[] args) {
		List<Factura> lstFacturas = new ArrayList<>();
		Factura factura;
		
		for (int i = 0; i < 10; i++) {
			factura = new Factura(i, "concepto" + i, Math.round(Math.random() * 10000));
			lstFacturas.add(factura);
		}
		
		long t1 = System.currentTimeMillis();
		
		ForkJoinPool pool = new ForkJoinPool(4);
		
		Optional<Double> opt = null;
		// se procesará en 4 hilos definidos anteriormente
		try {
			opt = pool.submit(() -> {
				return lstFacturas
							.parallelStream()
							.map(Factura::getImporte)
							.map(Principal02Pool::duplicar)
							.reduce(Double::sum);
			}).get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
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
