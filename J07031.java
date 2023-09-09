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
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class J07031 {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i<=(int)Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <Integer> arr1 = (ArrayList<Integer>) ois.readObject();
        Set <Integer> set1 = new TreeSet<>();
        for(Integer x : arr1) if(isPrime(x)) set1.add(x);
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> arr2 = (ArrayList<Integer>) ois.readObject();
        for(Integer x : set1){
            if(x > 500000) break;
            if(set1.contains(1000000 - x) && arr2.contains(x) == false && arr2.contains(1000000-x) == false) System.out.println(x + " " + (1000000-x));
        }
    }
}
