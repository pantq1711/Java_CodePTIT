import java.util.*;

public class J02106 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
            int n = sc.nextInt();
            int [][] a = new int [n][3];
            for(int i=0; i<n; ++i){
                for(int j=0; j<3; ++j) a[i][j] = sc.nextInt();
            }
            int cnt = 0;
            for(int i=0; i<n; ++i){
                int sum = 0;
                for(int j=0; j<3; ++j) sum += a[i][j];
                if(sum >= 2) cnt++;
            }
            System.out.println(cnt);
        // }
    }
    public static long countpairs(long [] a, long k){
        Map<Long,Long> mp = new HashMap<>();
        long count = 0;
        for(long x : a){
            count += mp.getOrDefault(k - x, 0L);
            mp.put(x, mp.getOrDefault(x, 0L) + 1);
        }
        return count;
    }
}
