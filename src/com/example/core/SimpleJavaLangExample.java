package com.example.core;

public class SimpleJavaLangExample {

	public static void main(String args[]) {
		int a = 20, b = 30;
		int sum = Math.addExact(a, b);
		int max = Math.max(a, b);
		double pi = Math.PI;
		System.out.println("Sum = " + sum + ", Max = " + max + ", PI = " + pi);
		
		String str = "JAVA PROGRAMMING";
		System.out.println("NEW STRING: "+str.replace('A', 'a'));
	}

}
