
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Map <String, SanPham> mapSP = new HashMap <>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mapSP.put(sp.getID(), sp);
        }
        ArrayList <HoaDon> arr = new ArrayList <>();
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            String s = sc.nextLine();
            HoaDon hd = new HoaDon(s);
            SanPham sp = mapSP.get(hd.getID());
            hd.setName(sp.getName());
            hd.setP1(sp.getPrice1());
            hd.setP2(sp.getPrice2());
            arr.add(hd);
        }
        
        Collections.sort(arr);
        
        for(HoaDon hd : arr)
        {
            System.out.println(hd);
        }
    }
    
}
//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105