package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        solve(0,arr,target,lst,ans);

        System.out.println(ans);
    }
    static void solve(int i,int[] arr,int target,List<Integer> lst,List<List<Integer>> ans) {
        if (i == arr.length)
        {
            if (target == 0) {
                ans.add(new ArrayList<>(lst));
            }
            return;
        }

        if (arr[i] <= target)
        {
            lst.add(arr[i]);
            solve(i,arr,target-arr[i],lst,ans);
            lst.remove(lst.size()-1);
        }
        solve(i+1,arr,target,lst,ans);
    }
}
