import java.util.*;

public class J01025
{
    public static boolean check(int n){
        return (int)Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt(), d1 = sc.nextInt();
        int maxA = Math.max(a, Math.max(c, Math.max(a1, c1))), maxB = Math.max(b, Math.max(d, Math.max(b1, d1))),minA = Math.min(a, Math.min(c, Math.min(a1, c1))), minB = Math.min(b, Math.min(d, Math.min(b1, d1)));
        int MAX = Math.max(maxA - minA, maxB - minB);
        System.out.println(MAX * MAX);
    }
}