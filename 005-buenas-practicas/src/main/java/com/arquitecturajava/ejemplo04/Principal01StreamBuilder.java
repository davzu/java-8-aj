package com.arquitecturajava.ejemplo04;

import java.util.stream.Stream;

public class Principal01StreamBuilder {

	public static void main(String[] args) {
		Stream<Integer> stream = streamNumeros(100);
		
		stream.forEach(System.out::println);
	}
	
	public static Stream<Integer> streamNumeros(int tope) {
		Stream.Builder<Integer> builder = Stream.builder();
		
		for (int i = 0; i < tope; i++) {
			if(i%2 == 0) {
				builder.add(i);	
			}
		}
		
		return builder.build();
	}

}
