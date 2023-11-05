/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <SinhVien> arr = new ArrayList <>();
        String s = "";
        while(sc.hasNextLine())
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            String s4 = sc.nextLine();
            String s5 = sc.nextLine();
            
            arr.add(new SinhVien(s1, s2, s3, s4, s5));
        }
        Collections.sort(arr);
        for(SinhVien sv : arr)
        {
            System.out.println(sv);
        }
    }
}
