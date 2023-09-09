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
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine().trim();
            if(s.compareTo("END" ) == 0) break;
            String [] arr = s.split("\\s+");
            String newName = "";
            for(String x : arr){
                newName += Character.toUpperCase(x.charAt(0));
                for(int j=1; j<x.length(); ++j){
                    newName += Character.toLowerCase(x.charAt(j));
                }
                newName += " ";
            }
            newName.trim();
            System.out.println(newName);
        }
        sc.close();
    }
}
//   nGuYEN    vAN    naM
//tRan           TRUNG hiEU
//      vO le         hOA bINh
//END