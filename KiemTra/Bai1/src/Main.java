/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        while(true)
        {
            String s = n.toString();
            if(s.length() == 1) break;
            String s1 = s.substring(0, s.length() / 2), s2 = s.substring(s.length() / 2);
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            System.out.println(n1.add(n2));
            n = n1.add(n2);
        }
    }
}
