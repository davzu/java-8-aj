package com.arquitecturajava.ejemplo06_01.noJava8;

import com.arquitecturajava.comandos.ComandoEmail;
import com.arquitecturajava.comandos.ComandoFactura;
import com.arquitecturajava.comandos.ComandoGuardar;
import com.arquitecturajava.comandos.ComandoImprimir;
import com.arquitecturajava.comandos.CommandManager;
import com.arquitecturajava.dominio.Factura;

public class Principal03CommandPattern {

	public static void main(String[] args) {
		ComandoFactura cf1 = new ComandoImprimir();
		ComandoFactura cf2 = new ComandoGuardar();
		ComandoFactura cf3 = new ComandoEmail();
		
		CommandManager manager = new CommandManager();
		manager.add(cf1);
		manager.add(cf2);
		manager.add(cf3);
		
		Factura factura = new Factura(1, "ordenador", 200);
		
		manager.execute(factura);
	}

}
