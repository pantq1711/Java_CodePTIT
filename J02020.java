import java.util.*;

public class J02020 {
    public static void khoitao(int a[], int k) {
        for (int i = 1; i <= k; ++i) a[i] = i;
    }

    public static void sinh(int a[], int n, int k, int[] ok) {
        int i = k;
        while (i > 0 && a[i] == n - k + i) --i;
        if (i == 0) ok[0] = 0;
        else {
            ++a[i];
            for (int j = i + 1; j <= k; ++j) a[j] = a[j - 1] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), cnt = 0;
        int[] a = new int[n + 1];
        khoitao(a, k);
        int[] ok = { 1 };
        while (ok[0] == 1) {
            for (int i = 1; i <= k; ++i) System.out.print(a[i] + " ");
            sinh(a, n, k, ok);
            System.out.println();
            ++cnt;
        }
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}