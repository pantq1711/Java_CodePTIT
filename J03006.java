import java.util.*;

public class J03006
{
    public static boolean check(String n){
        for(int i=0; i<n.length(); ++i){
            if(n.charAt(i) % 2 != 0) return false;
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