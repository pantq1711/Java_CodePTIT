public import java.util.*;

public class J01016
{
    public static void check(long n){
        int cnt1 = 0, cnt2 = 0;
        while(n > 0){
            if(n % 10 == 4) ++cnt1;
            if(n % 10 == 7) ++cnt2;
            n /= 10;
        }
        cnt1 += cnt2;
        if(cnt1 == 4 || cnt1 == 7) System.out.println("YES");
        else System.out.println("NO");;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        check(n);
    }
} {
    
}
