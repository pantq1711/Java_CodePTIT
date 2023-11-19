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
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Map <String, MonHoc> mapMH = new HashMap <>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            MonHoc mh = new MonHoc(sc.nextLine());
            mapMH.put(mh.getID(), mh);
        }
        ArrayList <GiangVien> arr = new ArrayList <>();
        sc = new Scanner(new File("GIANGVIEN.in"));
        t = Integer.parseInt(sc.nextLine());
        Map <String, GiangVien> mapGV = new HashMap <>();
        while(t-- >0)
        {
            GiangVien gv = new GiangVien(sc.nextLine());
            mapGV.put(gv.getID(), gv);
            arr.add(gv);
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            HocPhan hp = new HocPhan(sc.nextLine());
            mapGV.get(hp.getIDGV()).setDiem(hp.getDiemchuan());
        }
        for(GiangVien gv : arr)
        {
            System.out.println(gv);
        }
    }
}
