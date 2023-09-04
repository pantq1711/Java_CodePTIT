import java.util.*;

public class J03007
{
    public static boolean check(String n){
        int sum = 0;
        for(int i=0; i<n.length(); ++i){
            sum += n.charAt(i) - '0';
        }
        String rev = new StringBuilder(n).reverse().toString();
        if(n.equals(rev) && sum % 10 == 0 && n.charAt(0)== '8' && n.charAt(n.length() - 1) == '8') return true;
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