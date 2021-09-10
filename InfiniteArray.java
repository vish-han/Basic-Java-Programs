package Searching;

public class InfiniteArray
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 3, 4, 5, 6, 8, 12, 31, 34, 45, 67, 123, 231, 454, 676 };
        System.out.println(ans(arr, 123));
    }
    
    static int ans(final int[] nums, final int target) {
        int start;
        int end;
        int temp;
        for (start = 0, end = 1; nums[end] < target; end += (end - start + 1) * 2, start = temp) {
            temp = end + 1;
        }
        return infiniteArray(nums, target, start, end);
    }
    
    static int infiniteArray(final int[] nums, final int target, int start, int end) {
        while (start <= end) {
            final int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                if (nums[mid] >= target) {
                    return mid;
                }
                start = mid + 1;
            }
        }
        return -1;
    }
}