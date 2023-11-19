
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
        
        Map <String, SinhVien> mapSV = new HashMap <>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mapSV.put(sv.getID(), sv);
        }
        
        Map <String, DoanhNghiep> mapDN = new HashMap <>();
        sc = new Scanner(new File("DN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            DoanhNghiep dn = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mapDN.put(dn.getIDDN(), dn);
        }
        
        ArrayList <SinhVien> arr = new ArrayList <>();
        sc = new Scanner(new File("THUCTAP.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            String [] words = s.trim().split("\\s+");
            String IDSV = words[0], IDDN = words[1];
            if(mapSV.containsKey(IDSV))
            {
                SinhVien sv = mapSV.get(IDSV);
                sv.setIDDN(IDDN);
//                số sinh viên tối đa có thể nhận là N thì từ sinh viên thứ N+1 trở đi theo danh sách đã sắp xếp theo mã sinh viên thì sẽ không được nhận.
                sv.setSL();
                arr.add(sv);
            }
        }
        Collections.sort(arr);
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            int N = mapDN.get(s).getSL();
            System.out.println("DANH SACH THUC TAP TAI " + mapDN.get(s).getNameDN() + ":");
            // đếm số lượng sinh viên thỏa mãn trong arr
            ArrayList <SinhVien> res = new ArrayList <>();
            for(SinhVien sv : arr)
            {
                if(sv.getIDDN().equals(s)) res.add(sv);
            }
            int SL = res.size();
            if(SL > N) SL = N;
            for(int i=0; i<SL; ++i)
            {
                System.out.println(res.get(i));
            }
        }
    }
}
