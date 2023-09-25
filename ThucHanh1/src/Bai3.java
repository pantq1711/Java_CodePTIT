/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Bai3 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            Map <Character, Integer> map = new HashMap <>();
            int n = sc.nextInt();
            String s = sc.next();
            int max = 0;
            for(int i=0; i<n; ++i)
            {
                for(int j=i+1; j<n; ++j)
                {
                    int len = 0;
                    while(j + len < n && s.charAt(i + len) == s.charAt(j + len)) ++len;
                    max = Math.max(max, len);
                }
            }
            System.out.println(max);
        }
    }
}