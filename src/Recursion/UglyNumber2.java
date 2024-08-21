package Recursion;

public class UglyNumber2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }
    static int nthUglyNumber(int n){
        int[] dp = new int[n];
        dp[0] = 1;

        int idx2 = 0,idx3 = 0,idx5 = 0;

        int multOf2 = 2;
        int multOf3 = 3;
        int multOf5 = 5;

        for(int i = 1; i < n; i++)
        {
            int smUglyNo = Math.min(multOf2,Math.min(multOf3,multOf5));
            System.out.println(smUglyNo);
            dp[i] = smUglyNo;

            if(smUglyNo == multOf2)
            {
                idx2++;
                multOf2 = dp[idx2] * 2;
            }
            if(smUglyNo == multOf3)
            {
                idx3++;
                multOf3 = dp[idx3] * 3;
            }
            if(smUglyNo == multOf5)
            {
                idx5++;
                multOf5 = dp[idx5] * 5;
            }
        }
        return dp[n-1];
    }
}
