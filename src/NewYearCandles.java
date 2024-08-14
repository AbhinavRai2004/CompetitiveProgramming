import java.util.Scanner;

public class NewYearCandles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int ans = a;
        int res = a;

        while(res >= b)
        {
            ans += res/b;
            int rem = res % b;
            res = res/b + rem;
        }

        System.out.println(ans);
    }
}
