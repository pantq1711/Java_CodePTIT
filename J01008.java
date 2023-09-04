import java.util.*;
public class J01008
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 1;
        while(t -- > 0){
            int n = sc.nextInt();
            System.out.printf("Test %d: ", cnt);
            for(int i=2; i<=(int)Math.sqrt(n); ++i){
                if(n % i == 0){
                    int count = 0;
                    System.out.printf("%d", i);
                    while(n % i == 0){
                        n /= i;
                        ++count;
                    }
                    System.out.printf("(%d) ", count);
                }
            }
            if(n != 1) System.out.printf("%d(1)", n);
            System.out.println();
            ++cnt;
        }
    }
}