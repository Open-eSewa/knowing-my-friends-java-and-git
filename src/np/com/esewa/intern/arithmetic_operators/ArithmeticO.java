/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internjava.day1;

/**
 *
 * @author santosh
 */
/**
 * This Class usage of arithmetic operators in Java.
 */
public class ArithmeticO {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
 
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

   
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a % b;
    }

    
    public static void main(String[] args) {
        ArithmeticO example = new ArithmeticO();

        int sum = example.addition(5, 3);
        System.out.println("Sum: " + sum);

        int difference = example.subtraction(10, 4);
        System.out.println("Difference: " + difference);

        int product = example.multiplication(6, 7);
        System.out.println("Product: " + product);

        double quotient = example.division(20, 5);
        System.out.println("Quotient: " + quotient);

        int remainder = example.modulus(17, 4);
        System.out.println("Remainder: " + remainder);
    }
}

