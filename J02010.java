import java.util.*;

public class J02010 {
    public static void swap(int a[], int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while(t-- >0){
        int n = sc.nextInt();
        int [] a = new int[n + 1];
        for(int i=0; i<n; ++i) a[i] = sc.nextInt();
        for(int i=0; i<n-1; ++i){
            for(int j=i+1; j<n; ++j){
                if(a[i] > a[j]) swap(a, i, j);
            }
            System.out.printf("Buoc %d: ", i + 1);
            for(int j=0; j<n; ++j) System.out.printf("%d ", a[j]);
            System.out.println();
        }
        // }
        sc.close();
    }
}
