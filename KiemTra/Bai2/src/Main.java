/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    
    public static boolean check(Integer n)
    {
        String s = Integer.toString(n);
        if(s.length() < 2) return false;
        for(int i=0; i<s.length()-1; ++i)
        {
            if(s.charAt(i) < s.charAt(i + 1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Map <Integer, Integer> map1 = new TreeMap <>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> arr = (ArrayList<Integer>) ois.readObject();
        for(Integer x : arr)
        {
            if(check(x))
            {
                if(map1.containsKey(x)) map1.put(x, map1.get(x) + 1);
                else map1.put(x, 1);
            }
        }
        Map <Integer, Integer> map2 = new TreeMap<>();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        arr = (ArrayList<Integer>) ois.readObject();
        for(Integer x : arr)
        {
            if(check(x))
            {
                if(map2.containsKey(x)) map2.put(x, map2.get(x) + 1);
                else map2.put(x, 1);                
            }
        }
        for(Map.Entry<Integer, Integer> mp : map1.entrySet())
        {
            System.out.println(mp.getKey() + " " + map1.get(mp.getKey()) + " " + map2.get(mp.getKey()));
        }
    }
}
