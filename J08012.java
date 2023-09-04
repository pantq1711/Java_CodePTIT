import java.util.*;
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt [] = new int [n + 1];
        for(int i=1; i<n; ++i){
            int u = sc.nextInt(), v = sc.nextInt();
            cnt[v]++;
            cnt[u]++;
        }
        for(int i=1; i<=n; ++i){
            if(cnt[i] == 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");   
    }
}
