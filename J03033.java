import java.math.BigInteger;
import java.util.*;
public class J03033
{       
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}