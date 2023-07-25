package com.example.core;

//Sub class
public class AdvancedCalculator extends Calculator{

    public AdvancedCalculator(){
        System.out.println("THIS IS ADVANCED CALCULATOR CONSTRUCTOR");
        angle = 45;
    }

    public AdvancedCalculator(double firstNumber, double secondNumber, double angle){
        super(firstNumber, secondNumber); //calling super class constructor
        System.out.println("THIS IS ADVANCED CALCULATOR CONSTRUCTOR - PARAMETERIZED");
        this.angle = angle;
    }

    public double angle;

    public double sinValue(){
        return Math.sin(angle);
    }

    public double cosValue(){
        return Math.cos(angle);
    }

    public double tanValue(){
        return Math.tan(angle);
    }

    //Method Overloading
    // 1. It occurs in super class and sub class
    // 2. Method signatures are same
    public double divide(){
        if(secondNumber == 0){
            System.out.println("DIVIDE BY ZERO IS NOT ALLOWED, HENCE RETURNING ZERO");
            return 0;
        }
        return firstNumber / secondNumber;
    }



}
