/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Bai7 {
    
    public static boolean check(String s)
    {
        for(int i=0; i<s.length(); ++i) if(!Character.isDigit(s.charAt(i))) return false;
        if(s.length() > 18) return false;
        long tmp = Long.parseLong(s);
        if(tmp < Integer.MAX_VALUE) return false;
        else return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while(sc.hasNext())
        {
            String s = sc.next();
            if(check(s)) res += Long.parseLong(s);
        }
        System.out.println(res);
    }
}
