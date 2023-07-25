package com.example.core;

//@FunctionalInterface //Annotation - Java 1.5 - Giving information to JRE/Java Containers
public interface BankInterface {
	// contains only method declarations/signatures

	public static final double RATE_OF_INTEREST = 10.5;

	public void createAccount(); // abstract methods

	public double getAccountBalance(String accountNumber);

	
	static void printStatement(){ 
		System.out.println("PRINTING THE STATEMENT"); 
	}

	default void addLoanAccount() {
		System.out.println("DEFAULT ACCOUNT IMPLEMENTATION");
	}

	/*
	 * default void printgLog(){ System.out.println("PRINTING BANK STATEMENT"); }
	 * 
	 * static void printStatement(){ System.out.println("PRINT STATEMENT"); }
	 * 
	 */

}
