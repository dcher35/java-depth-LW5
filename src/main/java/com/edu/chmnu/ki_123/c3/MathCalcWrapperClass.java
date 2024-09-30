package com.edu.chmnu.ki_123.c3;

import static java.lang.Math.*;

public class MathCalcWrapperClass {
    public static void main(String[] args) {
        Double x = 8.1, a = 2.5, b = 7.7, c = -4.32;

        Double y = exp(a * cos(x + 2));
        Double r = exp(-sin(b * x));
        Double t = c - cbrt(x);

        if (t == 0) {
            System.err.println("Error: Division by zero");
            return;
        }

        Double res = y - (r / t);

        System.out.printf("Result: %.3f\n", res);
    }
}