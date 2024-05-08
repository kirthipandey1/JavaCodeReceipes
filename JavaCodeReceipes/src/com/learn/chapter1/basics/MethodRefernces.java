package com.learn.chapter1.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRefernces {

	public static void main(String[] args) {
		//Example1
		Stream.of(1,2,3,4,5).forEach(x-> System.out.print(x+" "));
		
		System.out.println();
		
		//Example2
		Stream.of(1,2,3,4,5).forEach(System.out::print);
		
		System.out.println();
		
		//Example3
		Consumer<Integer> print = System.out::print;
		Stream.of(1,2,3,4,5).forEach(print);
		
		System.out.println();
		
		//Example4
		Stream.generate(Math::random).limit(10).forEach(System.out::print);
		
		System.out.println();
		
		//Example5
		List<String> str = Arrays.asList("this","is","a","list","of","strings");
		List<String> sorted1 = str.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		List<String> sorted2 = str.stream().sorted(String::compareTo).collect(Collectors.toList());
		
		System.out.println(sorted1);
		System.out.println(sorted2);
		
		//Example6
		Stream.of("this","is","a","list","of","strings").map(String::length).forEach(l -> System.out.print(l+" "));
		

	}

}
