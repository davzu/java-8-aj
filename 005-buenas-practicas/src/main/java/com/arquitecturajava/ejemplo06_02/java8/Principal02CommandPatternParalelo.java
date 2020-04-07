package com.arquitecturajava.ejemplo06_02.java8;

import java.util.stream.Stream;

import com.arquitecturajava.comandos.CommandManager2;
import com.arquitecturajava.dominio.Factura;

public class Principal02CommandPatternParalelo {

	public static void main(String[] args) {
		
		CommandManager2 manager = new CommandManager2();
		
		Factura factura = new Factura(1, "ordenador", 200);
		Factura factura2 = new Factura(1, "ordenador", 200);
		Factura factura3 = new Factura(1, "ordenador", 200);
		Factura factura4 = new Factura(1, "ordenador", 200);
		Factura factura5 = new Factura(1, "ordenador", 200);
		
		long t1 = System.currentTimeMillis();
		
		Stream<Factura> stream = Stream.of(factura, factura2, factura3, factura4, factura5);
		stream
			.parallel()
			.peek(CommandManager2::imprimir)
			.peek(CommandManager2::guardar)
			.peek(CommandManager2::enviar)
			.forEach(f-> System.out.println("Terminó"));
		
		long t2 = System.currentTimeMillis();
		
		System.out.println(t2- t1);
	}

}
