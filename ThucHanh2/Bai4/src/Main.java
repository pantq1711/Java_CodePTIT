/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.*;
public class Main {
    
    public static boolean check(String n)
    {
        for(int i=0; i<n.length(); ++i) if(Character.isDigit(n.charAt(i))) return true;
        return false;
    }
    
    public static boolean valid(String n)
    {
        for(int i =0; i<n.length(); ++i)
        {
            char c = n.charAt(i);
            if(c == '.' || c == '!' || c == '!' || c == '?' || c == ':' || c ==',') return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set <String> set = new TreeSet <>();
        while(sc.hasNext())
        {
            String s = sc.next();
            if(check(s) && valid(s))
            set.add(s);
        }
        for(String str : set)
        {
            System.out.println(str);
        }
    }
}
