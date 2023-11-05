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
        int n = sc.nextInt(), m = sc.nextInt();
        int [] a = new int[m], b = new int[m];
        for(int i=0; i<m; ++i)
        {
            a[i] = sc.nextInt();
            b[i] = n - a[i];
        }
        System.out.println(Math.max(new DienTich(a).getArea(), new DienTich(b).getArea()));
    }
}
