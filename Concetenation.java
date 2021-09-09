package com.company;

public class Concetenation
{
    public static void main(final String[] args) {
        final int[] nums = { 1, 2, 1 };
        runningSum(nums);
    }
    
    static void runningSum(final int[] nums) {
        int sum = 0;
        final int[] running = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            nums[i] = sum;
        }
        for (final int a : nums) {
            System.out.println(a);
        }
    }
}