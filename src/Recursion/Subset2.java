package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,arr,new ArrayList<>(),ans);

        System.out.println(ans);
    }
    static void solve(int idx, int[] arr, List<Integer> al,List<List<Integer>> ans){
        ans.add(new ArrayList<>(al));

        for(int i = idx; i < arr.length; i++)
        {
            if(i > idx && arr[i] == arr[i-1]) continue;

            al.add(arr[i]);
            solve(i+1,arr,al,ans);
            al.remove(al.size()-1);
        }
    }
}
