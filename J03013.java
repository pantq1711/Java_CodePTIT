import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
            BigInteger ans = a.subtract(b);
            if(ans.toString().length() < a.toString().length()) System.out.print(0);
            System.out.println(ans);
        }
    }
}
