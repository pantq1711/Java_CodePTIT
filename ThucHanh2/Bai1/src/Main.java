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
import java.math.BigInteger;
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        BigInteger [] a = new BigInteger[t];
        BigInteger res = BigInteger.ZERO;
        for(int i=0; i<t; ++i) 
        {
            a[i] = sc.nextBigInteger();
            res = res.add(a[i]);
        }
        Arrays.sort(a);
        System.out.println(a[0] + "\n" + a[t-1] + "\n" + res);
    }
}
