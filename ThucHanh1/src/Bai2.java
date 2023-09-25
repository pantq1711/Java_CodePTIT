/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Bai2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while(t-- >0)
        {
            Queue<Integer> q = new LinkedList<>();
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0; i<n; ++i) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int x : arr) q.add(x);
            long a = 0, b = 0;
            boolean check = false;
            while(!q.isEmpty())
            {
                if(!check)
                {
                    a = a * 10 + q.peek();
                }
                else b = b * 10 + q.peek();
                q.poll();
                check = !check;
            }
            System.out.println(a + b);
            
        }
        sc.close();
    }
}