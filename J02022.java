import java.util.*;

public class J02022 {
    public static void khoitao(int a[], int n) {
        for (int i = 1; i <= n; ++i) a[i] = i;
    }
    public static boolean check(int n, int k){
        int cnt = 1;
        while(n > 9){
            if(Math.abs(n / 10 % 10 - n % 10) == 1) return false;
            ++cnt;
            n/=10;
        }
        return cnt == k;
    }
    public static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void reverse(int []a, int l, int r){
        while(l < r){
            swap(a, l, r);
            ++l;
            --r;
        }
    }
    public static void sinh(int a[], int n, int[] ok) {
        int i = n - 1;
        while (i > 0 && a[i] > a[i+1]) --i;
        if (i == 0) ok[0] = 0;
        else {
            int j = n;
            while(a[j] < a[i]) --j;
            swap(a, i , j);
            reverse(a, i + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        khoitao(a, n);
        int[] ok = { 1 };
        while (ok[0] == 1) {
            int res = 0;
            for (int i = 1; i <= n; ++i) res = res * 10 + a[i];
            if(check(res, n)) System.out.println(res);
            sinh(a, n, ok);
        }            
        }
    }
}
