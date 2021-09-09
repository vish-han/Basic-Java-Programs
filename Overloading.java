package com.company;

public class Overloading
{
    public static void main(final String[] args) {
        fun(12);
        fun("vosj");
    }
    
    static void fun(final int a) {
        System.out.println(a);
    }
    
    static void fun(final String a) {
        System.out.println(a);
    }
    
    static void fun(final int... b) {
    }
}