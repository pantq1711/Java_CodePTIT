/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class J07052 {
    public static boolean tn(int n)
    {
        String tmp = Integer.toString(n);
        int l = 0, r = tmp.length() - 1;
        while(l <= r)
        {
            if(tmp.charAt(l) != tmp.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
}
