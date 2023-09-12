/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
public class J07006 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> arr = (ArrayList<Integer>) ois.readObject();
        int [] cnt = new int[1000001];
        for(Integer num : arr) cnt[num]++;
        for(int i=0; i<1000; ++i){
            System.out.println(i + " " + cnt[i]);
        }
        
    }
}
