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
    
    public static boolean check(int n)
    {
        String s = Integer.toString(n);
        if(s.length() < 2) return false;
        else 
        {
            for(int i=1; i<s.length(); ++i)
            {
                if(s.charAt(i-1) < s.charAt(i)) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        Map <Integer, Integer> map1 = new TreeMap <>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> arr = (ArrayList <Integer>) ois.readObject();
        for(Integer num : arr)
        {
            if(check(num)) 
            {
                if(map1.containsKey(num)) map1.put(num, map1.get(num) + 1);
                else map1.put(num, 1);
            }
        }
        Map <Integer, Integer> map2 = new TreeMap <>();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> arr1 = (ArrayList <Integer>) ois.readObject();
        for(Integer num : arr1)
        {
            if(check(num)) 
            {
                if(map2.containsKey(num)) map2.put(num, map2.get(num) + 1);
                else map2.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entryset : map1.entrySet())
        {
            System.out.println(entryset.getKey() + " " + map1.get(entryset.getKey()) + " " + map2.get(entryset.getKey()));
        }
    }
}
