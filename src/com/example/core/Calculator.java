package com.example.core;

//Base Class or Super Class
public class Calculator { // Properties & Behaviours
    //Class Variables or Instance Variables - Properties
    public double firstNumber;
    public double secondNumber;

    public static final double VALUE_OF_PI = 3.14;

    //Constructor - method name is same as the class name
    public Calculator(){
        System.out.println("THIS IS CALCULATOR CONSTRUCTOR");
        firstNumber = 45;
        secondNumber = 34;
    }
    //Parameterized Constructors
    public Calculator(double firstNumber, double secondNumber){
        System.out.println("THIS IS CALCULATOR CONSTRUCTOR - PARAMETERIZED");
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    //Method Overloading
    // 1. Occurs inside the same class
    // 2. Method signatures are different
    public double add(){
        double result = firstNumber + secondNumber; //local variable
        return result;
    }

    //Method Signature - <access_specifier> <return_type> <method_name>(<input_parameters>)
    //public - accessible anywhere in the project
    //private - accessible only inside the class in which is declared
    //protected - accessible only inside the package
    public double add(double thirdNumber){//local variable
        double result = firstNumber + secondNumber + thirdNumber; //local variable
        return result;
    }

    public double subtract(){
        return firstNumber - secondNumber;
    }

    public double multiply(){
        return firstNumber * secondNumber;
    }

    public  double divide(){
        return firstNumber / secondNumber;
    }

    public double areaOfCircle(double radius){
        return VALUE_OF_PI * radius * radius;
    }

}
