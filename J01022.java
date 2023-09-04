import java.util.*;

public class J01022
{
    public static String Fi(int n, long k, long a[]){
        if(n == 1) return "0";
        if(n == 2) return "1";
        if(k <= a[n-2]) return Fi(n-2, k, a);
        return Fi(n-1, k - a[n-2], a);
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        long dp[] = new long[93];
        dp[0] = 0; dp[1] = 1;
        for(int i=2; i<=92; ++i){
            dp[i] = dp[i-1] + dp[i-2];
        }
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Fi(n, k, dp));
        }
    }
}