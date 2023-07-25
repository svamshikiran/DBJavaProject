package com.example.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList(new String[] { "cat", "mat", "rat", "sat", "ate", "bet" });
		
        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(99);
        arrayList.add(45);
        arrayList.add(23);
        arrayList.add(98);
        arrayList.add(65);
		
		List<String> lettersA = numbers
				.stream()
				.filter((x) -> x.contains("a"))
				.collect(Collectors.toList());
		
		List<Integer> numbersA = arrayList
				.stream()
				.filter((x) -> (x>90))
				.collect(Collectors.toList());
		
		numbersA.forEach((a) -> {
			System.out.println(a);
		});
	}

}
