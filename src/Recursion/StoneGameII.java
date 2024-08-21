package Recursion;

public class StoneGameII {
    public static void main(String[] args) {
        int[] arr = {2,7,9,4,4};
        int M = 1;

        System.out.println(solve(1,0,arr,1,5));

    }
    static int solve(int person,int idx,int[] arr,int M,int n)
    {
        if(idx >= n) return 0;
        int stones = 0;
        int res = person == 1 ? -1 : Integer.MAX_VALUE;

        for(int x = 1; x <= Math.min(2*M,n-idx); x++)
        {
             stones += arr[idx+x-1];
             if(person == 1)
                 res = Math.max(res, stones + solve(0,idx+x , arr, Math.max(M,x),n));
             else res = Math.min(res, solve(1,idx+x,arr,Math.max(M,x),n));
        }

        return res;
    }
}
