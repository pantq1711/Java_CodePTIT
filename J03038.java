import java.util.*;
public class J03038
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
            String s = sc.next();
            Set <Character> st = new HashSet<Character>();
            for(int i=0; i<s.length(); ++i) st.add(s.charAt(i));
            System.out.println(st.size()); 
        // }
    }
}