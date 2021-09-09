package com.company;

public class Swap
{
    public static void main(final String[] args) {
        swap(12, 23);
    }
    
    static void swap(int a, int b) {
        final int temp = a;
        a = b;
        b = temp;
        System.out.println(invokedynamic(makeConcatWithConstants:(II)Ljava/lang/String;, a, b));
    }
}