package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PerfectSumProblem {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2,5,1,4,3};
        int target = 10;
        int[][] dp = new int[n+1][target+1];

        for(int x[] : dp)
            Arrays.fill(x,-1);

        int ans = solve(0,arr,0,target,dp);

        System.out.println(ans);
    }
    static int solve(int idx,int[] arr,int sum, int target,int[][] dp)
    {
        if(idx == arr.length)
        {
            if(sum == target) return 1;
            else return 0;
        }
        if(dp[idx][sum] != -1)
            return dp[idx][sum];

        int lt = 0;

        if(sum + arr[idx] <= target)
        {
            sum += arr[idx];
            lt = solve(idx+1,arr,sum,target,dp);
            sum -= arr[idx];
        }
        int rt = solve(idx+1,arr,sum,target,dp);

        return dp[idx][sum] = lt + rt;
    }
}
