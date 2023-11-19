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
            MonHoc mh = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mapMH.put(mh.getID(), mh);
        }
        
        ArrayList <HocPhan> arr = new ArrayList <>();
        sc = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            HocPhan hp = new HocPhan(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if(mapMH.get(hp.getID()) != null)
            hp.setNameMH(mapMH.get(hp.getID()).getName());
//            System.out.println(hp.getID());
            arr.add(hp);
        }
        
        Collections.sort(arr);
        String s = sc.next();
//        if(mapMH.containsKey(s))
//        {
            String nameMH = mapMH.get(s).getName();
            System.out.println("LICH GIANG DAY MON " + nameMH+ ":");
            for (HocPhan hp : arr) {
                if (hp.getID().equals(s)) {
                    System.out.println(hp);
                }
        }            
//        }
    }
}
