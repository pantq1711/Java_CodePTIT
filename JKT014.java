import java.util.*;
public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int [n];
            int res[] = new int [n];
            res[0] = 1;
            for(int i=0; i<n; ++i) a[i] = sc.nextInt();
            Stack <Integer> st = new Stack<>();
            for(int i=n-1; i>=0; --i){
                while(!st.empty() && a[st.peek()] < a[i]){
                    int idx = st.pop();
                    res[idx] = idx - i;
                }
                st.add(i);
            }
            while(!st.empty()){
                res[st.peek()] = st.peek() + 1;
                st.pop();
            } 
            for(int i=0; i<n; ++i) System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}