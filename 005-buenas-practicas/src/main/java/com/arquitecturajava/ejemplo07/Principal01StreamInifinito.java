package com.arquitecturajava.ejemplo07;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal01StreamInifinito {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.iterate(1, i-> i + 1);
		Optional<Integer> opt = stream.limit(3).reduce(Integer::sum);
		
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
	}

}
