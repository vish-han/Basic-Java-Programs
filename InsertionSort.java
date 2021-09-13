package Sorting;

import java.util.*;

public class InsertionSort
{
    public static void main(final String[] args) {
        final int[] ans = { 3, 4, 5, 1, 2 };
        insertion(ans);
        System.out.println(Arrays.toString(ans));
    }
    
    static void insertion(final int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; 0 < j && arr[j] < arr[j - 1]; --j) {
                swap(arr, j, j - 1);
            }
        }
    }
    
    static void swap(final int[] arr, final int j, final int i) {
        final int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}