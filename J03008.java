import java.util.*;

public class J03008
{
    public static boolean check1(char c){
        return c == '2' || c == '3' || c == '5' || c == '7';
    }
    public static boolean check(String n){
        int sum = 0;
        for(int i=0; i<n.length(); ++i){
            if(!check1(n.charAt(i))) return false;
        }
        String rev = new StringBuilder(n).reverse().toString();
        if(n.equals(rev)) return true;
        return false;
    }
    public static void main(String[] args)
    {   
        {
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0)
                if(check(sc.nextLine()))  System.out.println("YES");
                else System.out.println("NO");
        }
    }
}