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
public class J07023 {
    
    public static boolean snt(int n)
    {
        for(int i=2; i<=(int)Math.sqrt(n); ++i)
        {
            if(n % i == 0 ) return false;
        }
        return n > 1;
    }    
    
    public static boolean tn(int n)
    {
        String tmp = Integer.toString(n);
        int l = 0, r = tmp.length() - 1;
        while(l <= r)
        {
            if(tmp.charAt(l) != tmp.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        Map <Integer, Integer> map1 = new TreeMap <>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> arr = (ArrayList <Integer>) ois.readObject();
        for(Integer num : arr)
        {
            if(tn(num) && snt(num)) 
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
            if(tn(num) && snt(num)) 
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
