package com.learn.chapter2.function;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImplementPredicate {
	
	public static final Predicate<String> LENGTH_FIVE = s -> s.length()==5;
	public static final Predicate<String> STARTS_WITH = s -> s.startsWith("S");

	public String getNamesOfLength(int length, String...names) {
		return Arrays.stream(names).filter(s->s.length()==length).collect(Collectors.joining(", "));
	}
	
	public String getNamesStartWith(String s, String...names) {
		return Arrays.stream(names).filter(s1->s1.startsWith(s)).collect(Collectors.joining(", "));
	}
	
	public String getNamesSatisfyingCondition(Predicate<String> condition, String...names) {
		return Arrays.stream(names).filter(condition).collect(Collectors.joining(", "));
	}

}
