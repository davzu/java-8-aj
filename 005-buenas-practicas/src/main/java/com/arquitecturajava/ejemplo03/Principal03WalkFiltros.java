package com.arquitecturajava.ejemplo03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.File;

public class Principal03WalkFiltros {

	public static void main(String[] args) {
		try {
			Stream<Path> stream = Files.walk(Paths.get("./src")); // Paths Java 1.7
			stream
				.map(Path::toFile)
				.filter(f-> f.isFile())
				.map(File::getName)
				.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
