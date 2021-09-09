package com.company;

public class PythagoresTriplet
{
    public static void main(final String[] args) {
        pt(8, 5, 10);
    }
    
    static void pt(final int a, final int b, final int c) {
        if (a * a + b * b == c * c) {
            System.out.println("this is a Pythagorean triple");
        }
        else {
            System.out.println("this is not a Pythagorean triple");
        }
    }
}