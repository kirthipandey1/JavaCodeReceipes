package com.learn.chapter2.function;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Suppliers {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("...");
		
		DoubleSupplier randomSupplier = new DoubleSupplier() {
			public double getAsDouble() {
				return Math.random();
			}
		};
		
		logger.info("Anonymous inner class");
		logger.info(String.valueOf(randomSupplier.getAsDouble()));
		
		randomSupplier = () -> Math.random();
		
		logger.info("Lambda class");
		logger.info(String.valueOf(randomSupplier.getAsDouble()));
		
		randomSupplier = Math::random;
		
		logger.info("method reference");
		logger.info(String.valueOf(randomSupplier.getAsDouble()));
	
		List<String> names = Arrays.asList("Mal","Wash","Kaylee","Inara","Zoe","Jayne","Simon","River","Shepherd Book");
		
		Optional<String> first = names.stream().filter(name -> name.startsWith("C")).findFirst();
		System.out.println(first);
		System.out.println(first.orElse("Not present"));
		
		System.out.println(first.orElse(String.format("No result found in : %s", 
				names.stream().collect(Collectors.joining(" ")))));
		
		System.out.println(first.orElseGet(() -> String.format("No result found in : %s",
				names.stream().collect(Collectors.joining(" ")))));
	}

}
