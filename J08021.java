import java.util.Scanner;
import java.util.*;
public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.next();
            Stack <Integer> st = new Stack<>();
            st.push(-1);
            int res = -1;
            for(int i=0; i<s.length(); ++i){
                if(s.charAt(i) == '(') st.add(i);
                else {
                    st.pop();
                    if(st.empty()) st.add(i);
                    else res = Math.max(res, i - st.peek());
                }
            }
            System.out.println(res);
        }
    }
}