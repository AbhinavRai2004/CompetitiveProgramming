package Recursion;

import java.util.HashMap;

public class DecodeStr {
    public static void main(String[] args) {
        String ip = "11101111011111";
        String ans = "";

        int cn = 0;

        for(int it = 0; it < ip.length(); it++)
        {
            if(ip.charAt(it) == '1')
                cn++;
            else
            {
                ans += (char)(cn + 64);
                cn = 0;
            }
        }
        if(cn > 0)
            ans += (char)(cn+64);

        System.out.println(ans);
    }
}
