package org.example;

public class Calculator {
    public static double addition (double num1, double num2) {
        return num1 + num2;
        //Does Addition
    }
    public static double subtraction (double num1, double num2) {
        return num1 - num2;
        //Does Subtraction
    }

    public static double multiplication (double num1, double num2) {
        return num1 * num2;
        //Does Multiplication
    }
    public static double division (double num1, double num2) {
        return num1 / num2;
        //Does Division
    }
    public static void printMenu(){
        System.out.println("**************Menu**********");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
        System.out.println("*****************************");
        //Basic Menu
    }



}


