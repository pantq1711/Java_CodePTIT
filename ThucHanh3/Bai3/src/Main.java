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
        
        Scanner sc = new Scanner(new File("MATRIX.in"));
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            Matrix a = new Matrix(sc, n, m, k);
            a.display();
        }
    }
}
