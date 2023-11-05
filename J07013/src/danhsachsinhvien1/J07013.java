/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class J07013 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList <SinhVien> arr = (ArrayList<SinhVien>) ois.readObject();
        for(SinhVien sv : arr)
        {
            System.out.println(sv);
        }
        
    }
}

