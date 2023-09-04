import java.util.*;
public class J02034{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
                int n = sc.nextInt();
                int [] a = new int [n];
                for(int i=0; i<n; ++i) a[i] = sc.nextInt();
                boolean ok = false;
                for(int i=1; i<=a[n-1]; ++i){
                    if(Arrays.binarySearch(a, i) < 0){
                        System.out.println(i);
                        ok = true;
                    }
                }
                if(ok == false) System.out.println("Excellent!");
            // }
    }
}
// 5 6
// 1 2 3 4 5
// 3 4 5 6 7 8