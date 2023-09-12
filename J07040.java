/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList <String> arr = (ArrayList<String>) ois.readObject();
        Set <String> set = new TreeSet<>();
        for(String x : arr){
            String [] a = x.trim().toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(a));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String x = sc.next().toLowerCase();
            if(set.contains(x)){
                System.out.println(x);
                set.remove(x);
            }
        }
    }
}
