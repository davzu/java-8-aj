package com.arquitecturajava.dominio;

public class Documento2 implements Versionable<Documento2> {
	
	private String titulo;
	private int version;
	
	public Documento2(String titulo, int version) {
		this.titulo = titulo;
		this.version = version;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/* (non-Javadoc)
	 * @see com.arquitecturajava.dominio.Versionable#getVersion()
	 */
	@Override
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}
	
}
