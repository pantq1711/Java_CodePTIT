
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
public class J07047 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map <Character, LoaiPhong> map = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            LoaiPhong lp = new LoaiPhong(sc.nextLine());
            map.put(lp.getKyhieu(), lp);
        }
        
        ArrayList <KhachHang> arr = new ArrayList <>();
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.setDonGia(map.get(kh.getKyHieu()).getDongia());
            kh.setFee(map.get(kh.getKyHieu()).getFee());
            arr.add(kh);
        }
        Collections.sort(arr);
        for(KhachHang kh : arr)
        {
            System.out.println(kh);
        }
    }
    
}
