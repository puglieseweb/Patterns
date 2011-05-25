/*
 * Puglieseweb (c) Copyright 2011. All Right Reserved.
 */
package com.puglieseweb.learning.patterns.simplefactory;

/**
 * @author Emanuele Pugliese
 * @version 0.00.001 - 24 May 2011
 */
public class PizzaStore {
	// -------------- ATTRIBUTES SECTION --------------
	private final SimplePizzaFactory factory;
	private Pizza pizza;

	// -------------- Constructor --------------
	/**
	 * Constructor which initialize the PizzaStrore with a factory
	 * 
	 * @param factory
	 *            for creating different kind of pizza
	 */
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	// --------------- METHODS SECTION ---------------
	public Pizza orderPizza(String type) {
		
		pizza = factory.createPizza(type);
	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
