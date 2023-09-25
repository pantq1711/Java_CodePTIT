/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Bai1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            String s = sc.next();
            int [] cnt = new int[26];
            int res = 0;
            for(int i=0; i<s.length(); ++i) 
            {
                if(Character.isAlphabetic(s.charAt(i))) cnt[s.charAt(i) - 'A']++;
                else res += Integer.parseInt(Character.toString(s.charAt(i)));
            }
            for(int i=0; i<26; ++i){
                for(int j=0; j<cnt[i]; ++j)
                {
                    System.out.print((char)(i + 'A'));
                }
            }
            System.out.println(res);
        }
    }
}
