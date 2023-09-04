import java.util.*;

public class J02023 {
    public static void min(int s, int n) {
        if (s == 0 && n == 1) {
            System.out.print("0 ");
            return;
        }
        int[] a = new int[n];
        s -= 1;
        for (int i = n - 1; i >= 1; --i) {
            if (s > 9) {
                s -= 9;
                a[i] = 9;
            } else {
                a[i] = s;
                s = 0;
            }
        }
        a[0] = s + 1;
        for (int i = 0; i < n; ++i) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static void max(int s, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            if (s > 9) {
                s -= 9;
                a[i] = 9;
            } else {
                a[i] = s;
                s = 0;
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if (s > n * 9 || (s == 0 && n > 1)) {
            System.out.printf("-1 -1");
        } 
        else if(n == 1 && s < 10) System.out.printf("%d %d", s, s);
        else {
            min(s, n);
            max(s, n);
        }
    }
}
