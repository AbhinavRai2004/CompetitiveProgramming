package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        boolean[] flagArr = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();

        // Sort the array to handle duplicates
        Arrays.sort(nums);

        solve(nums, flagArr, al, ans);
        System.out.println(ans);
    }

    static void solve(int[] nums, boolean[] flagArr, List<Integer> al, List<List<Integer>> ans) {
        if (al.size() == nums.length) {
            ans.add(new ArrayList<>(al));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (flagArr[i]) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !flagArr[i - 1]) continue;

            al.add(nums[i]);
            flagArr[i] = true;
            solve(nums, flagArr, al, ans);
            al.remove(al.size() - 1);
            flagArr[i] = false;
        }
    }
}
