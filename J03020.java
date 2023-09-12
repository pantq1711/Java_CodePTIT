/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class J03020 {
    public static boolean thuanNghich(String s){
        int l = 0, r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) {
        Map <String, Integer> map = new LinkedHashMap<>();
        int max = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList <String> arr = new ArrayList <>();
        while(sc.hasNext()){
            String s = sc.next();
            if(thuanNghich(s)){
                if(s.length() > max) max = s.length();
                if(map.containsKey(s)) map.put(s, map.get(s) + 1);
                else map.put(s, 1);
            }
            if(s.isEmpty()) break;
        }
        Set <Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> mp : set){
            if(mp.getKey().length() == max){
                System.out.println(mp.getKey() + " " + mp.getValue());
            }
        }
    }
}
