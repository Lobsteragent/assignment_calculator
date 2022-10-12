package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            Calculator.printMenu();
            System.out.println("Enter operation type");
            char op = input.next().charAt(0);//Asks for operation and takes input
            System.out.println("Enter number 1");
            double num1 = input.nextInt();//Asks for first number and takes user input
            System.out.println("Using the number " + num1);
            System.out.println("Enter number 2");//Confirms first number, asks and takes second number
            double num2 = input.nextInt();
            System.out.println("Using the number " + num2);//Confirms second number
            switch (op) {
                case '+':
                    System.out.println("Result is " + Calculator.addition(num1, num2));
                    break;
                case '-':
                    System.out.println("Result is " + Calculator.subtraction(num1, num2));
                    break;
                case '*':
                    System.out.println("Result is " + Calculator.multiplication(num1, num2));
                    break;
                case '/':
                    System.out.println("Result is " + Calculator.division(num1, num2));
                    break;
                default:
                    System.out.println(op + " is not a valid option");
            } //Does the calculations or says the operation option is invalid

            System.out.println("Continue Calculations? y/n");//asks for continuation
            String continueOperation = input.next();
            if (continueOperation.equalsIgnoreCase("n")) {
                condition = false;//terminates loop
            }

        }
    }
}