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
    public static int solve(int [] value, String lama, String s)
    {
        int res = 0;
        Map <Character, Integer> map = new HashMap<>();
        for(int i=0; i<7; ++i)
        {
            map.put(lama.charAt(i), value[i]);
        }
        
        for(int i=0; i<s.length()-1; ++i)
        {
            char c1 = s.charAt(i), c2 = s.charAt(i+1);
            int val1 = map.get(c1), val2 = map.get(c2);
            
            if(val1 < val2) 
            {
                res += val2 - val1;
                ++i;
            }
            else 
            {
                res += i == s.length() - 2 ? val1 + val2 : val1;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            int [] value = {1, 5, 10, 50, 100, 500, 1000};
            String lama = "IVXLCDM";
            String s = sc.nextLine();
            System.out.println(solve(value, lama, s));
        }
    }
}
//4
//XIX
//DC
//CD
//XXXI