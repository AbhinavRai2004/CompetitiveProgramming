package Recursion;

import java.util.Scanner;

public class GooglyPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int tpNum = num;
        int sumNum = 0;

        while(tpNum > 0)
        {
            int remD = tpNum % 10;
            sumNum += remD;
            tpNum = tpNum/10;
        }
        if(isPrime(sumNum))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean isPrime(int num)
    {
        for(int i = 2; i * i <= num; i++)
        {
            if(num % i == 0) return false;
        }
        return true;
    }
}
