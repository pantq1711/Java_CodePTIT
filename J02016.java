import java.util.*;

public class J02016 {
    public static boolean search ( int j, int n, int arr[], int tim) {
        int l=j, r=n-1;
        while(l<=r) {
            int mid=(r+l)/2;
            if(tim==arr[mid]) return true;
            if(tim>arr[mid]) l=mid+1;
            else r=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), ok = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for (int i = 0; i < n-2; i++) {
                for (int j = i + 1; j < n-1; j++) {
                    long k = (long)( a[i] * a[i] )+ (long)( a[j] * a[j]);
                    if(search(j+1,n, a,(long)sqrt(tmp))){
                        check = 1;
                        printf("YES\n");
                        break;
                    }
                }
            }
            System.out.println(ok == 1 ? "YES" : "NO");
        }
        sc.close();
    }
}