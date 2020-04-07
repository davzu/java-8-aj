package com.arquitecturajava.ejemplo04;

public interface Filtro<T> {
	
	public boolean test(T t);
	
	default public Filtro<T> or (Filtro<T> filtro) {
		
		return (T t) -> {return test(t) || filtro.test(t);};
	}

}
