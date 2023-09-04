import java.util.*;

public class J02104 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
            int x, n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                x = sc.nextInt();
                if (i <= j && x == 1)
                    System.out.printf("(%d,%d)\n", i, j);
            }
        }
    // }
    }
}