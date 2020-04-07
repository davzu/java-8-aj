package com.arquitecturajava.ejemplo03;

import java.io.File;

public class Principal01IOSinStream {
	
	public static void main(String[] args) {
		File fichero = new File("./src");
		File[] ficheros = fichero.listFiles();
		
		for (File f : ficheros) {
			imprimir(f);
		}
	}
	
	private static void imprimir(File fichero) {
		if(fichero.isDirectory()) {
			for (File f : fichero.listFiles()) {
				imprimir(f);
			}
		} else {
			System.out.println(fichero.getName());
		}
	}

}
