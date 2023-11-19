/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            String s1 = s.substring(0, s.length() / 2), s2 = s.substring(s.length() / 2);
            int sum1 = 0, sum2 = 0;
            for(int i=0; i<s1.length(); ++i) sum1 += Character.valueOf(s1.charAt(i)) - 65;
            for(int i=0; i<s2.length(); ++i) sum2 += Character.valueOf(s2.charAt(i)) - 65;
            while(sum1 > 26) sum1 -= 26;
            while(sum2 > 26) sum2 -= 26;
            String s3 = "", s4 = "";
            for(int i=0; i<s1.length(); ++i) s3 += (char)(s1.charAt(i) + sum1);
            for(int i=0; i<s2.length(); ++i) s4 += (char)(s2.charAt(i) + sum2);
            System.out.println(s3);
        }
    }
}
