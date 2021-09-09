package com.company;

public class Scope
{
    static int x;
    
    public static void main(final String[] args) {
        System.out.println(Scope.x);
        final int x = 20;
        System.out.println(x);
        fun();
    }
    
    static void fun() {
        System.out.println(Scope.x);
    }
    
    static {
        Scope.x = 10;
    }
}