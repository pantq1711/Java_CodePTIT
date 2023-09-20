import java.util.*;

public class J02016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Set<Long> squareSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                squareSet.add(a[i] * a[i]);
            }

            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    long sumSquare = a[i] * a[i] + a[j] * a[j];
                    if (squareSet.contains(sumSquare)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            System.out.println(found == true ? "YES" : "NO");
        }
        sc.close();
    }
}
