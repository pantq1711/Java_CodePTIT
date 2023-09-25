/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Bai4 {
    
    public static void main(String[] args) {
        
        Set <String> arr1  = new TreeSet <>();
        Set <String> arr2  = new TreeSet <>();
        Set <String> arr3  = new TreeSet <>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
             String [] words1 = s.trim().split("\\s+");
            for(String word : words1) arr1.add(word.toLowerCase());
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            String [] words1 = s.trim().split("\\s+");
            for(String word : words1) arr2.add(word.toLowerCase());
        }
        Set <String> res1 = new TreeSet <>(arr1);
        res1.removeAll(arr2);
        Set <String> res2 = new TreeSet<>(arr2);
        res2.removeAll(arr1);
        for(String x : res1)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        for(String x : res2)
        {
            System.out.print(x + " ");
        }
    }
}
//2
//Lap trinh huong doi tuong
//ngon ngu lap trinh C++
//2
//lap trinh co ban
//lap trinh huong thanh phan