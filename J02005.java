import java.util.*;
public class J02005{
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static long lcm(long a, long b){
        return (long)a * b / gcd(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt();
            int []a = new int[n];
            int []b = new int[m];
            int []cnt1 = new int[100001];
            int []cnt2 = new int[100001];
            ArrayList <Integer> res = new ArrayList<>();
            for(int i=0; i<n; ++i){
                a[i] = sc.nextInt();
                cnt1[a[i]]++;
            }
            for(int i=0; i<m; ++i){
                b[i] = sc.nextInt();
                if(cnt1[b[i]] > 0){
                    res.add(b[i]);
                    cnt1[b[i]] = 0;
                }
            }
            Collections.sort(res);
            for(int x : res) System.out.print(x + " ");
        //  }
    }
}
// 1
// 10
// 1 7 2 8 3 3 2 1 3 2