import java.util.*;
public class J02006{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt();
            int []a = new int[n];
            int []b = new int[m];
            int []cnt1 = new int[100001];
            for(int i=0; i<n; ++i){
                a[i] = sc.nextInt();
                cnt1[a[i]]++;
            }
            for(int i=0; i<m; ++i){
                b[i] = sc.nextInt();
                cnt1[b[i]]++;
            }
            for(int i=1; i<1000; ++i){
                if(cnt1[i] != 0) System.out.print(i + " ");
            }
        //  }
    }
}
// 5 6
// 1 2 3 4 5
// 3 4 5 6 7 8