import java.util.*;
public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int res[] = new int [n];
            res[n - 1] = -1;
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for(int i=0; i<n; ++i){
                a[i] = sc.nextInt();
            }
            for(int i=1; i<n; ++i){
                while(!st.empty() && a[st.peek()] < a[i]){
                    int idx = st.pop();
                    res[idx] = a[i];
                }
                st.add(i);
            }
            while(!st.empty()){
                res[st.peek()] = -1;
                st.pop();
            }
            for(int i=0; i<n; ++i) System.out.print(res[i] + " ");
            System.out.println();
        }
    }   
}
