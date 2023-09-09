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
import java.io.File;
public class Main {
    public static boolean check(String s){
        for(int i=0; i<s.length(); ++i) if(Character.isAlphabetic(s.charAt(i))) return true;
        if(s.length() > 10) return true;
        if(Integer.parseInt(s) > Integer.MAX_VALUE && Integer.parseInt(s) < Integer.MAX_VALUE) return true;
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            String [] a= s.split("\\s+");
            for(String x : a){
                if(check(x)) arr.add(x);
            }
        }
        Collections.sort(arr);
        for(String str : arr){
            System.out.print(str + " ");
        }
    }
}
//12 3 4 5 6 7
//Aaa 1 1 Bbb XXX yyy 5 5
//999999999999999999999999
//9