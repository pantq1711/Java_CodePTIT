
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int [] cnt1 = new int[1001];
            int [] cnt2 = new int[1001];
            int [] a = new int [1001]; 
            for(int i=0; i<n; ++i)
            {
                a[i] = sc.nextInt();
                if(a[i] % 2 == 0) cnt1[a[i]]++;
                else cnt2[a[i]]++;
            }
            for(int i=1; i<=1000; ++i)
            {
                if(cnt1[i] != 0) System.out.print(i + " ");
            }
            System.out.println();
            for(int i=1000; i>0; --i)
            {
                if(cnt2[i] != 0) System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//1
//7
//3 7 12 8 5 4 888