/*
 * Puglieseweb (c) Copyright 2011. All Right Reserved.
 */
package com.puglieseweb.learning.patterns.simplefactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Emanuele Pugliese
 * @version 0.00.001 - 24 May 2011
 */
public class TestPizzaStore {
	// --------------- ATTRIBUTES SECTION ---------------
	private PizzaStore store;
	SimplePizzaFactory factory;
	
	// --------------- Set up TestClass ---------------
	@Before
	public void before(){
		factory = new SimplePizzaFactory();
		store = new PizzaStore(factory);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	// --------------- TESTS SECTION ---------------
	@Test
	public void testOrderPizza(){
		assertNotNull("Not inizialized PizzaStore", store);
		
		assertEquals(MargheritaPizza.class, store.orderPizza("margherita").getClass());
	}
	
	@Test
	public void testOrderPizzaExceptions(){
		assertNotNull("Not inizialized PizzaStore", store);
		
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("Pizza not Found");
		assertEquals(null, store.orderPizza("nonDefinedPizza"));
	}
}
