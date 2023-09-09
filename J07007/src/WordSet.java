/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class WordSet {
     private Set <String> set;
    public WordSet(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        set = new TreeSet<>();
        while(sc.hasNext()) set.add(sc.next().toLowerCase());       
    }
    @Override
    public String toString(){
        String res = "";
        for(String str : set) res += str + "\n";
        return res;
    }
}
