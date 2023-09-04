import java.util.Scanner;
import java.util.*;
public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i=0; i<n; ++i) a[i] = sc.nextInt();
        for(int i=0; i<n; ++i){
            for(int j=0; j<=i; ++j){
                for(int k=i; k>j; --k){
                    if(a[k] < a[k-1]){
                        int tmp = a[k];
                        a[k] = a[k-1];
                        a[k-1] = tmp;
                    }
                }
            }
        System.out.printf("Buoc %d: ", i);
        for(int j=0; j<=i; ++j) System.out.print(a[j] + " ");
        System.out.println();
        }
    }
}
