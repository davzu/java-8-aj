package com.arquitecturajava.ejemplo06_02.java8;

import java.util.stream.Stream;

import com.arquitecturajava.comandos.CommandManager2;
import com.arquitecturajava.dominio.Factura;

public class Principal01CommandPattern {

	public static void main(String[] args) {
		
		CommandManager2 manager = new CommandManager2();
		
		Factura factura = new Factura(1, "ordenador", 200);
		
		Stream<Factura> stream = Stream.of(factura);
		stream
			.peek(CommandManager2::imprimir)
			.peek(CommandManager2::guardar)
			.peek(CommandManager2::enviar)
			.forEach(f-> System.out.println("Terminó"));
	}

}
