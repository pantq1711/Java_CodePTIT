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
public class main {
    
    public static String convert(String s)
    {
        String res = "";
        String [] words = s.split("\\s+");
        res += words[words.length-1];
        for(int i=0; i<words.length-1; ++i)
        {
            res += words[i].charAt(0);
        }
        return res;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Set <String> set = new LinkedHashSet <>();
        Map <String, Integer> map = new LinkedHashMap <>();
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        while(sc.hasNextLine())
        {
            String s = sc.nextLine().trim().toLowerCase();
            System.out.println(s);
            String tmp = convert(s);
            if(map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        for(Map.Entry <String,Integer> entry : map.entrySet())
        {
            System.out.print(convert(entry.getKey()));
            if(entry.getValue() != 1) System.out.println(entry.getValue());
            System.out.println("@ptit.edu.vn");
        }
    }
}
