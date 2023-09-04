import java.math.BigInteger;
import java.util.*;
public class J01004
{       
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            String [] arr = s.trim().split("\\s+");
            for(int i=0; i<arr.length; ++i){
                StringBuilder x = new StringBuilder(arr[i]);
                System.out.print(x.reverse().toString() + " ");            
            }
            System.out.println();
        }
    }
}