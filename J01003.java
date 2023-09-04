import java.math.BigInteger;
import java.util.*;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            BigInteger number = sc.nextBigInteger();
            BigInteger res = number.mod(BigInteger.valueOf(100));
            
            if (res.equals(BigInteger.valueOf(86))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
