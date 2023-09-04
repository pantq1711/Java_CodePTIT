import java.util.*;
public class J01012
{
    public static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            int cnt = 0;
            if(n % 2 == 0) ++cnt;
            for(int i=2; i<=(int)Math.sqrt(n); ++i){
                if(n % i == 0){
                    if(i != n/i){
                        if(i % 2 == 0){
                            if(n/i%2==0) cnt += 2;
                            else ++cnt;
                        }
                        else if(n/i%2==0) ++cnt;
                    }
                    else {
                        if(i % 2 == 0) ++cnt;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}