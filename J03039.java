import java.math.BigInteger;
import java.util.*;
public class J03039
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            BigInteger c = a.mod(b), d = b.mod(a);
            if(c.equals(java.math.BigInteger.ZERO) || d.equals(java.math.BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}