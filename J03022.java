/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> arr = new ArrayList<>();
        String res = "";
        int count = 0;
        ArrayList <Integer> arr1 = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next().trim();
            ++count;
            Character end = s.charAt(s.length() - 1);
            if(end == '.' || end == '!' || end == '?'){
                res = s.toLowerCase().substring(0, s.length() - 1) + "\n";
                arr.add(res);
                res = "";
                arr1.add(count);
            }
            else {
                res = s.toLowerCase() + " ";
                arr.add(res);
                res = "";
            }
            if(s.isEmpty()) break;
        }
        for(int i=0; i<arr.size(); ++i){
            if(i == 0 || arr1.contains(i)){
                System.out.print(arr.get(i).toUpperCase().charAt(0) + arr.get(i).substring(1));
            }
            else System.out.print(arr.get(i));
        }
    }
}
// ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu vay, nam nay la          tron 10 nam!
//    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay la KY THI LAN THU 11.