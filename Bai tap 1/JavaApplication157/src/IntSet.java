/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class IntSet {
    
    Set <Integer> set;
    
    int [] a;

    public IntSet(int[] a) {
        this.a = a;
        this.set = new TreeSet <>();
        for(int i=0; i<a.length; ++i){
            this.set.add(a[i]);
        }
        
    }
    
    public IntSet union(IntSet s)
    {
        IntSet res = new IntSet(this.a);
        res.set.addAll(s.set);
        return res;
    }
    
    @Override
    public String toString()
    {
        String res = "";
        for(Integer num : this.set) res += num + " ";
        return res;
    }
}
