package com.example.core;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(45);
        arrayList.add(23);
        arrayList.add(98);
        arrayList.add(65);
        
        arrayList.add(2, 56);

        arrayList.remove(3);

        arrayList.forEach(element -> {
            System.out.println("ELEMENT: "+element);
        });


    }
}
