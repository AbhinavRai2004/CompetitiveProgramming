package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        solve(0,arr,al,ans);

        System.out.println(ans);
    }

//    static void solve(int idx,int[] arr,ArrayList<Integer> al){
//        if(idx == arr.length)
//        {
//            System.out.println(al);
//            return;
//        }
//
//        al.add(arr[idx]);
//        solve(idx+1,arr,al);
//        al.remove(al.size() - 1);
//        solve(idx+1,arr,al);
//    }


    static void solve(int idx, int[] arr, List<Integer> al,List<List<Integer>> ans){
        if(idx == arr.length)
        {
            ans.add(new ArrayList<>(al));
            return;
        }

        al.add(arr[idx]);
        solve(idx+1,arr,al,ans);
        al.remove(al.size() - 1);
        solve(idx+1,arr,al,ans);
    }
}
