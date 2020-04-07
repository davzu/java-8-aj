package com.arquitecturajava.ejemplo03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal02Walk {

	public static void main(String[] args) {
		try {
			Stream<Path> stream = Files.walk(Paths.get("./src")); // Paths Java 1.7
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
