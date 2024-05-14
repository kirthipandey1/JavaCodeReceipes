package com.learn.chapter3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedStreams {

	public static void main(String[] args) {
		List<String> strings = Stream.of("this","is","a","list","of","strings").collect(Collectors.toList());
		System.out.println(strings);
		
		List<Integer> ints = IntStream.of(3,1,2,6,4,1).boxed().collect(Collectors.toList());
		System.out.println(ints);
		
		List<Integer> ints1 = IntStream.of(3,1,4,3,2,1).mapToObj(Integer::valueOf).collect(Collectors.toList());
		System.out.println(ints1);
		
		List<Integer> ints2 = IntStream.of(3,1,4,5,1,2,3).collect(ArrayList<Integer>::new,
				ArrayList::add, ArrayList::addAll);
		System.out.println(ints2);
		
		int[] array = IntStream.of(1,4,3,5,6).toArray();
		IntStream.of(array).forEach(a-> System.out.print(a+" "));
		System.out.println();
		Arrays.stream(array).forEach(a->System.out.print(a+" "));
		
	}

}
