package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(a, b));
                    break;

                case 2:
                    System.out.println("Result: " + calc.subtract(a, b));
                    break;

                case 3:
                    System.out.println("Result: " + calc.multiply(a, b));
                    break;

                case 4:
                    System.out.println("Result: " + calc.divide(a, b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
