package com.learn.chapter2.function;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class ImplementPredicateTest {
	
	private ImplementPredicate demo = new ImplementPredicate();
	private String[] names;
	
	@Before
	public void setUp() {
		names = Stream.of("Mal","Wash","Kaylee","Inara","Zoe","Jayne","Simon","River","Shepherd Book")
				.sorted().toArray(String[]::new);
	}
	
	@Test
	public void getNamesOfLength5() throws Exception {
		assertEquals("Inara, Jayne, River, Simon", demo.getNamesOfLength(5, names));
	}
	
	@Test
	public void getNamesStartWithS() throws Exception {
		assertEquals("Shepherd Book, Simon",demo.getNamesStartWith("S", names));
	}
	
	@Test
	public void getNamesSatisfyingCondition() throws Exception {
		assertEquals("Inara, Jayne, River, Simon", demo.getNamesSatisfyingCondition(
				s -> s.length()==5, names));
		
		assertEquals("Shepherd Book, Simon", demo.getNamesSatisfyingCondition(
				s -> s.startsWith("S"), names));
		
		assertEquals("Inara, Jayne, River, Simon",demo.getNamesSatisfyingCondition( 
				ImplementPredicate.LENGTH_FIVE, names));
		
		assertEquals("Shepherd Book, Simon",demo.getNamesSatisfyingCondition(
				ImplementPredicate.STARTS_WITH, names));
	}
	
	@Test
	public void compositePredicate() throws Exception {
		assertEquals("Simon",demo.getNamesSatisfyingCondition(
				ImplementPredicate.LENGTH_FIVE.and(ImplementPredicate.STARTS_WITH), names));
		
		assertEquals("Inara, Jayne, River, Shepherd Book, Simon",
				demo.getNamesSatisfyingCondition(ImplementPredicate.LENGTH_FIVE.or(
						ImplementPredicate.STARTS_WITH), names)); 
		
		assertEquals("Kaylee, Mal, Shepherd Book, Wash, Zoe",
				demo.getNamesSatisfyingCondition(ImplementPredicate.LENGTH_FIVE.negate(), names));
	}

}
