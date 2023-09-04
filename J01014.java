import java.util.*;
public class J01014
{
    public static boolean snt(long n){
        for(int i=2; i<=(int)Math.sqrt(n); ++i) if(n % i ==0) return false;
        return n > 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            long n = sc.nextLong();
            long max = 2;
            for(long i=2; i<=(long)Math.sqrt(n); ++i){
                if(n % i == 0){
                    max = Math.max(max, i);
                    while(n % i == 0) n /= i;
                }
            }
            if(snt(n)) max = n;
            System.out.println(max);
        }
    }
}