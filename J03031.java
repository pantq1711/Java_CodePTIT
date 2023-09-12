/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class J03031 {
    public static boolean check(String s, int k){
        Set <Character> set = new HashSet<>();
        for(int i=0; i<s.length(); ++i) set.add(s.charAt(i));
        if(s.length() >= 26 && (k + set.size()) >= 26) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-- >0){
    String s = sc.next().toLowerCase().trim();
    int k = sc.nextInt();
    if(check(s, k)) System.out.println("YES");
    else System.out.println("NO");
    sc.nextLine();
    }
}
}
//2
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//4
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//24
