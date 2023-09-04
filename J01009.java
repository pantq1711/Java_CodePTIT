import java.util.*;
public class J01009
{
    public static long gt(int n){
        if(n <= 1) return 1;
        return (long)(n*gt(n-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t -- > 0){
            int n = sc.nextInt();
            long sum = 0;
            long[] f = new long[25];
            f[1] = 1;
            for(int i = 2; i <= 20; ++i) f[i] = i * f[i - 1];
            for(int i=1; i<=n; ++i) sum += f[i];
            System.out.println(sum);
        // }
    }
}