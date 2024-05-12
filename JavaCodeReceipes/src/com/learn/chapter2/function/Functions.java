package com.learn.chapter2.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functions {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mal","Wash","Kaylee","Inara","Zoe"
				,"Jayne","Simon","River","Shepherd Book");
		
		//Anonymous Inner class
		List<Integer> namesLength = names.stream().map(
				new Function<String,Integer> () {
					public Integer apply(String s) {
						return s.length();
					}
				}).collect(Collectors.toList());
		System.out.println(namesLength);
		
		
		//lambda expressions
		namesLength = names.stream().map(a-> a.length()).collect(Collectors.toList());
		System.out.println(namesLength);
		
		//method reference
		namesLength = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(namesLength);

	}

}
