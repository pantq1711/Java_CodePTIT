import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {
    static ArrayList<String> res = new ArrayList<>();

    public static void solve(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        while (!q.isEmpty()) {
            String top = q.poll();
            if (top.length() > n) break;
            res.add(top);
            String num1 = top + "6";
            String num2 = top + "8";
            q.add(num1);
            q.add(num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n);
            Collections.sort(res, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    if (a.length() == b.length())
                        return b.compareTo(a);
                    return b.length() - a.length();
                }
            });
            System.out.println(res.size());
            for (String str : res) {
                System.out.print(str + " ");
            }
            System.out.println();
            res.clear();
        }
    }
}
