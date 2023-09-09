/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class SinhVien  implements Comparable<SinhVien> {
   private String ID, Name, Class, Email;
    public SinhVien(String ID, String Name, String Class, String Email) {
        this.ID = ID;
        this.Name = "";
        Name = Name.trim();
        String [] arr = Name.split("\\s+");
        for(String x : arr){
           this.Name += Character.toUpperCase(x.charAt(0));
           for(int j=1; j<x.length(); ++j) this.Name += Character.toLowerCase(x.charAt(j));
           this.Name += " ";
           }
        this.Class = Class;
        this.Email = Email;
    }
    @Override
    public String toString(){
        return this.ID + " " + this.Name + " " + this.Class +" " + this.Email;
    }
    @Override
    public int compareTo(SinhVien o){
        return this.ID.compareTo(o.ID);
    }
}
