import java.util.*;

public class J01017
{
    public static boolean check(long n){
        while(n > 9){
            if(Math.abs((n/10%10) - n % 10) != 1) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");           
        }
    }
}