package com.arquitecturajava.ejemplo06_01.noJava8;

import com.arquitecturajava.comandos.ComandoEmail;
import com.arquitecturajava.comandos.ComandoFactura;
import com.arquitecturajava.comandos.ComandoGuardar;
import com.arquitecturajava.comandos.ComandoImprimir;
import com.arquitecturajava.dominio.Factura;

public class Principal02CommandPattern {

	public static void main(String[] args) {
		ComandoFactura cf1 = new ComandoImprimir();
		ComandoFactura cf2 = new ComandoGuardar();
		ComandoFactura cf3 = new ComandoEmail();
		
		Factura factura = new Factura(1, "ordenador", 200);
		
		cf1.execute(factura);
		cf2.execute(factura);
		cf3.execute(factura);
	}

}
