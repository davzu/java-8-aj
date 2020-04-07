package com.arquitecturajava.dominio;

public interface Versionable<T extends Versionable<T>> {

	int getVersion();

	default T esMayor(T t1) {
		if(this.getVersion() > t1.getVersion()) {
			return (T) this;
		} else {
			return t1;
		}
	}
	
	

}