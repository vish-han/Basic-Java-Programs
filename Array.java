package com.company;

import java.util.*;

public class Array
{
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final ArrayList<Integer> arr = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; ++i) {
            arr.add(in.nextInt());
        }
        System.out.println(arr);
    }
}