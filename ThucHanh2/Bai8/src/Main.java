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
    
    static int [] x = new int [31];
    static int ok;
    public static void ktao(int j)
    {
        for(int i=1; i<=j; ++i) x[i] = 0;
    }
    public static void sinh(int j)
    {
        int i = j;
        while(i >= 1 && x[i] == 1)
        {
            x[i] = 0;
            --i;
        }
        if(i == 0) ok = 0;
        else x[i] = 1;
    }
    public static boolean check(int n)
    {
        if(n % 2 == 1) return false;
        int l = 1, r = n;
        while(l < r)
        {
            if(x[l] != x[r]) return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            ArrayList <String> res = new ArrayList <>();
            int n = sc.nextInt();
            for(int i=2; i<=n; i+=2)
            {
                ok = 1;
                ktao(i);
                while(ok == 1)
                {
                    String s = "";
                    if(check(i))
                    {
                     for(int j=1; j<=i; ++j)
                    {
                        s += Integer.toString(x[j]);
                    }
                    res.add(s);                       
                    }
                    sinh(i);
                }     
            }
            for(String x : res)
            {
                System.out.print(x + " ");
            }
            System.out.println("");
            res.clear();
        }
    }
}
