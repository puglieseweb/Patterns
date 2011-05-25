/*
 * Puglieseweb (c) Copyright 2011. All Right Reserved.
 */
package com.puglieseweb.learning.patterns.simplefactory;

/**
 * Standard functionality common to all pizza types
 * 
 * @author Emanuele Pugliese
 * @version 0.00.001 - 24 May 2011
 */
/** 
 * @author Emanuele Pugliese
 * @version 0.00.001 - 25 May 2011
 */
public abstract class Pizza {
	// -------------- ARGUMENTS SECTON --------------
	/**
	 * Constructor -
	 */
	public Pizza() {
		System.out.println(toString());
	}
	// -------------- METHODS SECTION --------------
	/**
	 * Prepare pizza operation
	 */
	void prepare() {
		System.out.println("Pizza prepared");
	}

	/**
	 * Bake pizza operation
	 */
	public void bake() {
		System.out.println("Pizza baked");
	}

	/**
	 * Cut pizza operation
	 */
	public void cut() {
		System.out.println("Pizza cutted");
	}

	/**
	 * Box pizza operation
	 */
	public void box() {
		System.out.println("Pizza boxed");
	}
	
	
	/**
	 * Define the pizza name
	 */
	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}
}
