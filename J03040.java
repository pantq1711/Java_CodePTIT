import java.math.BigInteger;
import java.util.*;
public class J03040
{   public static boolean bangnhau(char a, char b, char c, char d, char e)
    {
        return (a == b && b == c && c == d && d == e) || (a == b && b == c && d == e) ||(a < b && b < c && c < d && d < e);
    }
    public static boolean check(String s)
    {
        for(int i=0; i<s.length(); ++i){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine().substring(5).replace(".", "");
            if(check(s) || bangnhau(s.charAt(0), s.charAt(1), s.charAt(2), s.charAt(3), s.charAt(4))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}