import java.util.*;

public class J02103 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt();
            int [][] a = new int [n][m];
            int [][] b = new int [m][n];
            for(int i=0; i<n; ++i){
                for(int j=0; j<m; ++j) b[j][i] = a[i][j] = sc.nextInt();
            }
            System.out.printf("Test %d:\n", cnt);
            for(int i=0; i<n; ++i){
                for(int j=0; j<n; ++j){
                    int x = 0;
                    for(int k=0; k<m; ++k) x += a[i][k] * b[k][j];
                    System.out.printf("%d ", x);
                }
                System.out.println();
            }
            ++cnt;
            // System.out.println();
        }
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
