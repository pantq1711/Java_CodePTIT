import java.math.BigInteger;
import java.util.*;
public class J03011
{       
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}