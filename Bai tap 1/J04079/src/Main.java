
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        Map <String, SanPham> map = new HashMap <>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            map.put(sp.getID(), sp);
        }
        ArrayList <KhachHang> arr = new ArrayList <>();
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            kh.setMonth(map.get(kh.getIDSP()).getMonths());
            kh.setPrice(map.get(kh.getIDSP()).getPrice());
            arr.add(kh);
        }
        Collections.sort(arr);
        for(KhachHang kh : arr)
        {
            System.out.println(kh);
        }
    }
}
