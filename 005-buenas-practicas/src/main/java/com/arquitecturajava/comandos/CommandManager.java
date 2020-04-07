package com.arquitecturajava.comandos;

import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Factura;

public class CommandManager {

	List<ComandoFactura> lstComandos = new ArrayList<>();
	
	public void add(ComandoFactura comando) {
		lstComandos.add(comando);
	}
	
	public Factura execute(Factura factura) {
		for (ComandoFactura comando : lstComandos) {
			comando.execute(factura);
			
		}
		
		return factura;
	}
	
}
