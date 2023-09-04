import java.util.Scanner;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int [] a = new int [n];
            boolean check = false;
            for(int i=0; i<n; ++i) a[i] = sc.nextInt();
            int start = 0;
            long cur_sum = 0;
            for(int i=0; i<n; ++i){
                cur_sum += a[i];
                while(cur_sum > k && start < i){
                    cur_sum -= a[start];
                    ++start;
                }
                if(cur_sum == k){
                    check = true;
                    break;
                }
            }
            if(check == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
