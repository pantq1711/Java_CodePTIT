import java.util.*;

public class J01024
{
    public static boolean check(int n){
        while(n > 0){
            if(n % 10 != 0 && n % 10 != 2 && n % 10 != 1) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");           
        }
    }
}