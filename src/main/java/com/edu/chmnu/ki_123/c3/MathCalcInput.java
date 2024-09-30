package com.edu.chmnu.ki_123.c3;

import java.util.Scanner;
import static java.lang.Math.*;

public class MathCalcInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double x, a, b, c;

            System.out.print("Enter the value of x: ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for x!");
                return;
            }

            System.out.print("Enter the value of a: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for a!");
                return;
            }

            System.out.print("Enter the value of b: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for b!");
                return;
            }

            System.out.print("Enter the value of c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for c!");
                return;
            }

            double result = (exp(a * cos(x + 2))) - ((exp(-sin(b * x))) / (c - cbrt(x)));

            System.out.printf("Result: %.3f\n", result);
        }
    }
}