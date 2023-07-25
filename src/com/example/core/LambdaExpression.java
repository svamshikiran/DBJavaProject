package com.example.core;

public class LambdaExpression {

    public static void main(String[] args) {

        // Separated by -> arrow mark
        // LHS - arguments/parameters that were needed by the abstract method
        // RHS - logic that we want to implement
        AddInterface obj1 = (a, b) -> System.out.println("RESULT: "+(a+b));
        /*
        public class Addition implements AddInterface{
            public void add(int first, int second){
                System.out.println("RESULT: "+(first+second);
            }
        }
         */

        AddInterface obj2 = (a, b) -> {
            System.out.println("FIRST VALUE: "+a);
            System.out.println("SECOND VALUE: "+b);
            System.out.println("RESULT: "+(a+b));
        };

        obj1.add(24, 45);
        obj2.add(24, 44);
    }

}
