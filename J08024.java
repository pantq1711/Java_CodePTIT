import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    static String res;

    public static void solve(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while (!q.isEmpty()) {
            String top = q.poll();
            int num = Integer.parseInt(top);
            if (num % n == 0) {
                res = top;
                break;
            }
            String num1 = top + "0";
            String num2 = top + "9";
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
            System.out.println(res);
        }
    }
}
