package Recursion;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            // Step 2: Find the element to swap
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap elements
            swap(nums, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 2]
    }
}
