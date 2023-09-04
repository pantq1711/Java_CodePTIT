import java.util.Scanner;
import java.util.*;
public class J02037
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine().trim();
            String[] a = s.split("\\s+");
            int n = a.length;
            int cnt1 = 0, cnt2 = 0;
            for(int i=0; i<n; ++i){
                if(Integer.parseInt(a[i]) % 2 == 0) cnt1++;
                else ++cnt2;
            }
            if((n % 2 == 0 && cnt1 > cnt2 )||(n % 2 == 1 && cnt1 < cnt2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}