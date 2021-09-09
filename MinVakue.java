package com.company;

public class MinVakue
{
    public static void main(final String[] args) {
        final int[] arr = { 2, 34, 452, 1, 3 };
        System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, min(arr)));
    }
    
    static int min(final int[] arr) {
        int min1 = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }
        return min1;
    }
}