/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Man {
    public static void main(String[] args) {
        Set <Integer> set1 = new TreeSet <>();
        Set <Integer> set2 = new TreeSet <>();
        Set <Integer> set3 = new TreeSet <>();
        Set <Integer> set4 = new TreeSet <>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) 
        {
            a[i] = sc.nextInt();
            set1.add(a[i]);
            set4.add(a[i]);
        }
        for(int i = 0; i<m; i++) 
        {
            b[i] = sc.nextInt();
            if(set1.contains(b[i])) set2.add(b[i]);
            set3.add(b[i]);
        }
        set1.removeAll(set3);
        set3.removeAll(set4);
        for(Integer num : set2)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        for(Integer num : set1)
        {
            System.out.print(num + " ");
        }
        System.out.println("");
        for(Integer num : set3)
        {
            System.out.print(num + " ");
        }
    
    }
}
