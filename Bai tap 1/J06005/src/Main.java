/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map <String, KhachHang> mapKH = new HashMap <>();
        while(t-- >0)
        {
            KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mapKH.put(kh.getID(), kh);
        }
        
        t = Integer.parseInt(sc.nextLine());
        Map <String, MatHang> mapMH = new HashMap <>();
        while(t-- >0)
        {
            MatHang mh = new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mapMH.put(mh.getID(), mh);
        }
        ArrayList <HoaDon> arr = new ArrayList <>();
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            String [] words = s.trim().split("\\s+");
            KhachHang kh = mapKH.get(words[0]);
            MatHang mh = mapMH.get(words[1]);
            HoaDon hd = new HoaDon(kh, mh, Integer.parseInt(words[2]));            
            arr.add(hd);
        }
        for(HoaDon hd : arr)
        {
            System.out.println(hd);
        }
    }
}
//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4