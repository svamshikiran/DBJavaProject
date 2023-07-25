package com.example.core;

public class Test {

    public static void main(String[] args) {

        //Object initialization
        // RHS is the object creation
        // LHS - name of the object & Reference of the object
        AdvancedCalculator aCalcObj = new AdvancedCalculator(30, 4, 60);

        System.out.println("ADDITION: "+aCalcObj.add());
        System.out.println("SUBTRACTION: "+aCalcObj.subtract());
        System.out.println("MULTIPLICATION: "+aCalcObj.multiply());
        System.out.println("DIVISION: "+aCalcObj.divide());

        System.out.println("ADDITION: "+aCalcObj.add(40));

        System.out.println("SINE VALUE: "+aCalcObj.sinValue());
        System.out.println("TANGENT VALUE: "+aCalcObj.tanValue());

        Calculator calcOne = new Calculator();
        Calculator calcTwo = new Calculator();

        System.out.println("VALUE OF PI IN CALCONE: "+Calculator.VALUE_OF_PI);

    }
}


// Inheritance - inheriting the features from a base/super class
// Data Abstraction - hiding the implementation details
// Data Encapsulation - placing all related elements into one single entity
// Polymorphism - existing in many forms










