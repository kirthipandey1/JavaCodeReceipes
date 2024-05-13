package com.learn.chapter3.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		
		//stream.of
		String names = Stream.of("Gomez","Morticia","wednesday","Pugsley").collect(Collectors.joining(", "));
		System.out.println(names);

		//arrays.stream
		String[] munsters = {"Herman","Lily","Eddie","Marilyn","Grandpa"};
		names = Arrays.stream(munsters).collect(Collectors.joining(", "));
		System.out.println(names);
		
		//Stream.iterate
		List<BigDecimal> nums = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
				.limit(10).collect(Collectors.toList());
		System.out.println(nums);
		
		//iterate
		Stream.iterate(LocalDate.now(), d -> d.plusDays(1L)).limit(10).forEach(System.out::println);
		
		//generate
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		
		List<String> bradyBunch = Arrays.asList("Greg","Marcia","Peter","Jan","Bobby","Cindy");
		names = bradyBunch.stream().collect(Collectors.joining(", "));
		System.out.println(names);
		
		//range (doesn't include last)
		List<Integer> ints = IntStream.range(10, 15).boxed().collect(Collectors.toList());
		System.out.println(ints);
		
		//rangeClosed (includes last)
		List<Long> longs = LongStream.rangeClosed(10, 15).boxed().collect(Collectors.toList());
		System.out.println(longs);
	}

}
