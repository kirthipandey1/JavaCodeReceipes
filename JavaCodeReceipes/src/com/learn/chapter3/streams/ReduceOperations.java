package com.learn.chapter3.streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceOperations {

	public static void main(String[] args) {
		String[] strings = "this is an array of strings".split(" ");
		long count = Arrays.stream(strings).map(String::length).count();
		System.out.println("count is : "+count);
		
		int totalLength = Arrays.stream(strings).mapToInt(String::length).sum();
		System.out.println("sum is : "+totalLength);
		
		OptionalDouble avg = Arrays.stream(strings).mapToInt(String::length).average();
		System.out.println("Average is : "+avg);
		
		OptionalInt max = Arrays.stream(strings).mapToInt(String::length).max();
		OptionalInt min = Arrays.stream(strings).mapToInt(String::length).min();
		System.out.println("max value is : "+max+" and min value is : "+min);
		
		int sum = IntStream.rangeClosed(1, 10).reduce((x,y) -> x+y).orElse(0);
		System.out.println("sum of range : "+sum);
		
		int sum1 = IntStream.rangeClosed(1, 10).reduce((x,y) -> {
			System.out.printf("x= %d, y=%d%n",x,y);
			return x+y;
		}).orElse(0);
		
		System.out.println(sum1);
		
		int doubleSum = IntStream.rangeClosed(1, 10).reduce((x,y) -> x+2*y).orElse(0);
		System.out.println("doublesum : "+doubleSum);
		
		int doubleSum1 = IntStream.rangeClosed(1, 10).reduce(0, (x,y)-> x+2*y);
		System.out.println("doubleSum1 : "+doubleSum1);
		
		int sum2 = Stream.of(1,2,3,4,5,6,7,8,9,10).reduce(0, Integer::sum);
		System.out.println("sum2 : "+sum2);
		
		Integer max1 = Stream.of(3,1,4,1,5,9).reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max1 : "+max1);
		
		String s = Stream.of("this","is","a","list").reduce("", String::concat);
		System.out.println("concat string : "+s);

	}

}
