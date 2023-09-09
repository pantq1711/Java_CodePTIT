/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class J07032 {
    public static boolean check(String s){
        if(s.length() <= 1 || s.length() % 2 == 0) return false;
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            if((s.charAt(l) - '0' )% 2 == 0 ||( s.charAt(r) - '0' % 2) == 0) return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream oib = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> arr1 = (ArrayList<Integer>) oib.readObject();
        int [] cnt1 = new int[1000001];
        int [] cnt2 = new int[1000001];
        for(Integer x : arr1) if(check(x.toString())) cnt1[x]++;
        int count = 0;
        oib = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> arr2= (ArrayList<Integer>) oib.readObject();
        for(Integer x : arr2) if(check(x.toString())) cnt2[x]++;
        for(int i=0; i<=1000000; ++i){
            if(cnt1[i] != 0 && cnt2[i] != 0){
                System.out.println(i + " " +( cnt1[i] + cnt2[i]));
                ++count;
            }
            if(count == 10) break;
        }
        oib.close();
}
}