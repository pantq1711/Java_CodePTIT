import java.math.BigInteger;
import java.util.*;
public class J03009
{       
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            TreeSet <String> st = new TreeSet<String>();
            List <String> a = Arrays.asList(s1.split("\\s+"));
            List <String> b = Arrays.asList(s2.split("\\s+"));
            for(String str : a){
                if(!b.contains(str)) st.add(str);
            }
            for(String str : st){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}