import java.util.*;
public class J02007{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 1;
        while(t-- >0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] cnt = new int[100001];
            for(int i=0; i<n; ++i){
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            System.out.printf("Test %d:\n", count);
            for(int i=0; i<n; ++i){
                if(cnt[a[i]] != 0){
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    cnt[a[i]] = 0;
                }
            }
            ++count;
        }
    }
}
// 1
// 10
// 1 7 2 8 3 3 2 1 3 2