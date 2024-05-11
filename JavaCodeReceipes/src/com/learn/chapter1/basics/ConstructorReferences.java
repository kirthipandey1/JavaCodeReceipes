package com.learn.chapter1.basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstructorReferences {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Grace Gracing","Barbara","Ada","Karen");
		List<Person> p1 = names.stream().map(na -> new Person(na)).collect(Collectors.toList());
		System.out.println(p1);
		List<Person> p2 = names.stream().map(Person::new).collect(Collectors.toList());
		System.out.println(p2);
		
		Person before = new Person("Grace Hopper");
		List<Person> p3 = Stream.of(before).collect(Collectors.toList());
		Person after = p3.get(0);
		assertTrue(before==after);
		
		before.setName("Grace Grace");
		assertEquals("Grace Grace",after.getName());
			
		List<Person> p4 = Stream.of(before).map(a->a.getName())
				.map(Person::new).collect(Collectors.toList());
		after = p4.get(0);
		assertFalse(before==after);
		assertEquals(before.getName(),after.getName());
		
		String[] str = {"Grace","Barbara","Ada","Karen"};
		Person p5 = new Person(str);
		System.out.println(p5.getName());
		
		List<Person> p6 = names.stream().map(a->a.split(" "))
				.map(Person::new).collect(Collectors.toList());
		System.out.println(p6);
		
		Person[] pr = names.stream().map(Person::new).toArray(Person[]::new);
		for(Person p:pr) {
			System.out.print(p+" : ");
		}
		
		
		
	}
}
