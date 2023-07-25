package com.example.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1, "JAVA");
        studentMap.put(2, "SPRING");
        studentMap.put(3, "GIT");
        studentMap.put(4, "MAVEN");
        
        studentMap.put(2, "SPRINGBOOT");

        Set<Integer> keySet = studentMap.keySet();

        keySet.forEach(key-> {
            System.out.println("MAP ELEMENT: "+studentMap.get(key));
        });

    }
}
