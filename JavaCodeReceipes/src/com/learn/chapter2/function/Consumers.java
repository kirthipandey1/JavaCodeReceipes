package com.learn.chapter2.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("this","is","a","list","of","strings");
		
		//anonymous inner class
		strings.forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.print(s+" ");
			}
		});
		
		System.out.println();

		//lambda expression
		strings.forEach(s->System.out.print(s+" "));
		
		System.out.println();
		
		//method reference
		strings.forEach(System.out::print);
	}

}
