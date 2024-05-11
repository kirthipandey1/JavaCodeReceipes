package com.learn.chapter1.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StaticMethods {

	public static void main(String[] args) {
		List<String> bonds = Arrays.asList("Connery","Lazenby","Moore","Dalton","Brosnan","Craig");
		
		//lexicographical
		List<String> sort1 = bonds.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		System.out.println("natural : "+sort1);
		
		//reverse
		List<String> sort2 = bonds.stream().sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
		System.out.println("Reverse : "+sort2);
		
		//lowerCase
		List<String> sort3 = bonds.stream().sorted(Comparator
				.comparing(String::toLowerCase)).collect(Collectors.toList());
		System.out.println("Lowercase : "+sort3);
		
		//By length
		List<String> sort4 = bonds.stream().sorted(Comparator
				.comparingInt(String::length)).collect(Collectors.toList());
		System.out.println("Length : "+sort4);
		
		//By length and lexicographical
		List<String> sort5 = bonds.stream().sorted(Comparator
				.comparingInt(String::length).thenComparing(
						Comparator.naturalOrder())).collect(Collectors.toList());
		System.out.println("By length and natural : "+sort5);

	}

}
