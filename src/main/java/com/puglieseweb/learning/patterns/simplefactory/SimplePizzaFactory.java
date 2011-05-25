/*
 * Puglieseweb (c) Copyright 2011. All Right Reserved.
 */
package com.puglieseweb.learning.patterns.simplefactory;

/**
 * @author Emanuele Pugliese
 * @version 0.00.001 - 24 May 2011
 */
public class SimplePizzaFactory {

	// ------------ METHODS SECTION ------------

	/**
	 * Create the specified type of pizza
	 * 
	 * @param type
	 *            of pizza to create
	 * @return a Pizza type or null if no match is found
	 * 
	 */
	public Pizza createPizza(String type) throws RuntimeException {

		Pizza pizza = null;

		if (type.equals("margherita"))
			pizza = new MargheritaPizza();
		else if (type.equals("peperoni"))
			pizza = new PeperoniPizza();

		if (pizza == null) {
			throw new RuntimeException("Pizza not Found!");
		}

		return pizza;
	}
}