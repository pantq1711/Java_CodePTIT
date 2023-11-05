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
        Map <String, Integer> map = new LinkedHashMap <>();
        while(t-- >0)
        {
            User u = new User(sc.nextLine());
            map.put(u.getLine(), 0);
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            User u = new User(sc.nextLine());
            if(map.containsKey(u.getLine())) 
            {
                map.put(u.getLine(), map.get(u.getLine()) + 1);
            }
        }
        for(Map.Entry <String,Integer> entry : map.entrySet())
        {
            System.out.print(entry.getValue() + " ");
        }
    }
}
//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password