package com.company;

public class ArrayPermutation
{
    public static void main(final String[] args) {
        final int[] arr = { 5, 0, 1, 2, 3, 4 };
        final int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            ans[i] = arr[arr[i]];
        }
        for (final int a : ans) {
            System.out.print(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, a));
        }
    }
}