package com.edu.chmnu.ki_123.c3;

import static java.lang.Math.*;

public class MathCalc {
    public static void main(String[] args) {
        double x = 8.1, a = 2.5, b = 7.7, c = -4.32;

        //double result = (exp(a * cos(x+2))) - ((exp(- sin(b * x)))/(c - cbrt(x)));

        double y = (exp(a * cos(x+2)));
        double r = (exp(- sin(b * x)));
        double t = (c - cbrt(x));

        double res = y - (r / t);

        //System.out.printf("Result №1: %.3f\n", result);
        System.out.printf("Result: %.3f\n", res);
    }
}