package Sorting;

import java.util.*;

public class BubbleSort
{
    public static void main(final String[] args) {
        final int[] ans = { 1, 2, 3, 4 };
        bubbleSort(ans);
        System.out.println(Arrays.toString(ans));
    }
    
    static void bubbleSort(final int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            boolean swapped = true;
            for (int j = 1; j < nums.length - i; ++j) {
                if (nums[j] < nums[j - 1]) {
                    final int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = false;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}