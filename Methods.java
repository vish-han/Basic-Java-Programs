package com.company;

import java.util.*;

public class Methods
{
    public static void main(final String[] args) {
        System.out.println(sum(12, 23));
    }
    
    static int sum(final int a, final int b) {
        final Scanner in = new Scanner(System.in);
        final int sum = a + b;
        return sum;
    }
}