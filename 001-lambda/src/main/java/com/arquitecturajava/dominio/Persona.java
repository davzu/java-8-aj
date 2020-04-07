package com.arquitecturajava.dominio;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellidos;
	private int edad;
		
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona otro) {
		return this.getNombre().compareTo(otro.getNombre());
	}
	
//	public static boolean estaJubilado(Persona persona) {
//		return persona.getEdad() > 65;
//	}
	
	public boolean estaJubilado() {
		return this.getEdad() > 65;
	}

}
