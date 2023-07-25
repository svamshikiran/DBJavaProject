package com.example.core;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
	
	public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Duestche");
        stack.push("Java");
        stack.push("Grads");
        stack.push("Program");
  
        // Iterator for the stack
        Iterator<String> itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println();
  
        stack.pop();
  
        // Iterator for the stack
        itr= stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }


}
