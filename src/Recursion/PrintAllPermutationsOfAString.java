package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsOfAString {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        boolean[] flagArr = new boolean[nums.length];
        solve(nums,al,ans,flagArr);
        System.out.println(ans);
    }
    static void solve(int[] nums,List<Integer> al,List<List<Integer>> ans,boolean[] flagArr){
        if(al.size() == nums.length)
        {
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(!flagArr[i])
            {
                al.add(nums[i]);
                flagArr[i] = true;
                solve(nums,al,ans,flagArr);
                al.remove(al.size()-1);
                flagArr[i] = false;
            }
        }

    }
}


//swap method.


//class Solution {
//    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
//        if(index == nums.length) {
//            // copy the ds to ans
//            List<Integer> ds = new ArrayList<>();
//            for(int i = 0;i<nums.length;i++) {
//                ds.add(nums[i]);
//            }
//            ans.add(new ArrayList<>(ds));
//            return;
//        }
//        for(int i = index;i<nums.length;i++) {
//            swap(i, index, nums);
//            recurPermute(index+1, nums, ans);
//            swap(i, index, nums);
//        }
//    }
//    private void swap(int i, int j, int[] nums) {
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        recurPermute(0, nums, ans);
//        return ans;
//    }
//}
