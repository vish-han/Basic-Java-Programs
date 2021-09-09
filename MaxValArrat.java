package com.company;

public class MaxValArrat
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 23, 4, 34, 2 };
        System.out.println(max(arr));
    }
    
    static int max(final int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; ++i) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}