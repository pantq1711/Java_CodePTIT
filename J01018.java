import java.util.*;

public class J01018
{
    public static boolean check(long n){
        int sum = 0;
        while(n > 9){
            if(Math.abs(n / 10 % 10 - n % 10) != 2) return false;
            sum += n % 10;
            n /= 10;
        }
        sum += n % 10;
        return sum % 10 == 0;
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