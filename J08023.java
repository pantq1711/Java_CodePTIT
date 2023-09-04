import java.util.*;
public class J08023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int l[] = new int[n];
            int r[] = new int[n];
            for(int i=0; i<n; ++i) a[i] = sc.nextInt();
            first_max_right(a, n, r);
            first_max_left(a, n, l);
            long res = 0;
            for(int i=0; i<n; ++i){
                res = Math.max(res, (long)a[i] * (r[i] - l[i] - 1));
            }
            System.out.println(res);
        }
    }
    public static void first_max_left(int [] a, int n, int l[]){
        Stack <Integer> st = new Stack<>();
        for(int i=n-1; i>=0; --i){
            while(!st.empty() && a[st.peek()] > a[i]){
                int idx = st.pop();
                l[idx] = i; 
            }
            st.add(i);
        }
        while(!st.empty()){
            l[st.peek()] = -1;
            st.pop();
        }
    }
    public static void first_max_right(int [] a, int n, int r[]){
        Stack <Integer> st = new Stack<>();
        for(int i=0; i<n; ++i){
            while(!st.empty() && a[st.peek()] > a[i]){
                int idx = st.pop();
                r[idx] = i; 
            }
            st.add(i);
        }
        while(!st.empty()){
            r[st.peek()] = n;
            st.pop();
        }       
    }
}