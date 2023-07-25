package com.example.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        TreeSet<String> hs = new TreeSet<String>();
 
        hs.add("Vinsys");
        hs.add("Java");
        hs.add("Grads");
        hs.add("Program");
        hs.add("is Very Helpful");
        hs.add("Grads");
  
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


}
