import java.util.*;
public class J01010
{
    public static boolean check(long n){
        int cnt = 0;
        while(n > 0){
            if(n % 10 != 0 && n % 10 != 8 && n % 10 != 9){
                if(n % 10 != 1 ) return false;
                else ++cnt;
            }
            n/=10;
        }
        return cnt >= 1;
    }
    public static void solve(long n){
        if(!check(n)) System.out.printf("INVALID");
        else {
            long res = 0;
            int k = 0;
            while(n > 0){
                if(n % 10 == 1) res += (long) Math.pow(10, k);
                ++k;
                n /= 10;
            }
            System.out.print(res);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            solve(n);
            System.out.println();
        }
    }
}