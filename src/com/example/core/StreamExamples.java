package com.example.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        System.out.println("START TIME: "+java.time.LocalDateTime.now());
        System.out.println("START TIME: "+java.time.LocalDate.now());
        System.out.println("START TIME: "+java.time.LocalTime.now());

        List<Integer> numberList = new ArrayList<>();

        for(int value = 1; value < 100; value++)
            numberList.add(value);

        System.out.println("SIZE OF THE LIST: "+numberList.size());
        /*
        numberList.forEach(value->{
            if(value > 90)
                System.out.println(value);
        });

        Stream<Integer> sequentialStream = numberList.stream();

        Stream<Integer> finalList = sequentialStream.filter(value -> value>90);

        finalList.forEach(val -> System.out.println(val));*/


        Stream<Integer> parallelStream = numberList.parallelStream();

        Stream<Integer> finalParallelList = parallelStream.filter(value -> value>90);

        finalParallelList.forEach(val -> System.out.println(val));

        System.out.println("END TIME: "+java.time.LocalTime.now());


    }
}
