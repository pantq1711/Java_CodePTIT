/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class SinhVien {
    private String ID, Name, Class, Date;
    private double GPA;

    public SinhVien(int  ID, String Name, String Class, String Date, double GPA) {
        this.ID = "B20DCCN" + String.format("%03d", ID);
        this.Name = Name;
        this.Class = Class;
        if(Date.charAt(1) == '/') Date = "0" + Date;
        if(Date.charAt(4) == '/') Date = Date.substring(0,3) + "0" + Date.substring(3);
        this.Date = Date;
        this.GPA = GPA;
    }
    public void display(){
        System.out.print(this.ID + " " + this.Name + " " + this.Class + " " + this.Date + " ");
        System.out.printf("%.2f\n", this.GPA);
    }
}
