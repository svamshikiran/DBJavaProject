package com.example.evolution;

public class HelloWorld{
	
	/**
	 * A Static block that is called once the class is loaded
	 */
	static {
		System.out.println("THIS IS A STATIC BLOCK");
	}
		
	/**
	 * The Constructor that would be called when a class is invoked to create a object 
	 */
	public HelloWorld() {
		System.out.println("THIS IS CONSTRUCTOR");
	}
	

	/**
	 * The Main Method that will be called as a part of the first Entry point
	 * @param args
	 */


	public static void main(String[] args) {
		// Statement to output data to screen 
		System.out.println("Welcome to World of java");
	}


}
