package com.company;

import java.util.*;

public class ArraySwap
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 23, 34, 13, 312 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void swap(final int[] arr, final int index1, final int index2) {
        final int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    static void reverse(final int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; ++start, --end) {
            swap(arr, start, end);
        }
    }
}