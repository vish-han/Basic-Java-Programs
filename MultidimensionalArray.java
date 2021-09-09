package com.company;

import java.util.*;

public class MultidimensionalArray
{
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                arr[row][col] = in.nextInt();
            }
        }
        for (final int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}