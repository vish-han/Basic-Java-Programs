package com.company;

import java.util.*;

public class VarArgs
{
    public static void main(final String[] args) {
        fun(2, 3, 34, 344, 34, 3, 12, 0, 12);
    }
    
    static void fun(final int... v) {
        System.out.println(Arrays.toString(v));
    }
}