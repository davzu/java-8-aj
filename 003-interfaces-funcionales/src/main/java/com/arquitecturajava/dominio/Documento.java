package com.arquitecturajava.dominio;

public class Documento {
	
	private String titulo;
	private int version;
	
	public Documento(String titulo, int version) {
		this.titulo = titulo;
		this.version = version;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	// un bioperator recibe 2 parámetros del mismo tipo y
	// devuelve un parámetro del tipo que recibe
	public static Documento esMayor(Documento actual, Documento siguiente) {
		if(actual.getVersion() > siguiente.getVersion()) {
			return actual;
		} else {
			return siguiente;
		}
	}
	
}
