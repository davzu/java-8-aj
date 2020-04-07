package com.arquitecturajava.comandos;

import com.arquitecturajava.dominio.Factura;

public class CommandManager2 {
	
	public static Factura guardar(Factura factura) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Guardando la factura: " + factura.getNumero());
		return factura;
	}

	public static Factura enviar(Factura factura) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Enviando la factura: " + factura.getNumero());
		return factura;
	}
	
	public static Factura imprimir(Factura factura) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(factura.getNumero());
		System.out.println(factura.getConcepto());
		System.out.println(factura.getImporte());
		return factura;
	}
	
}
