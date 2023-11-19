
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class Matrix {
    
    int n, m, k;
    
    int [][] a;
    private ArrayList <Integer> arr = new ArrayList <>();

    public Matrix(Scanner sc, int n, int m, int k) {
        this.k = k;
        this.n = n;
        this.m = m;
        a = new int [n + 1][m + 1];
        for(int i=1; i<=n; ++i)
        {
            for(int j=1; j<=m; ++j) 
            {
                a[i][j] = sc.nextInt();
                if(j == k) arr.add(a[i][j]);
            }
        }
        Collections.sort(arr);
    }
    
    public void display()
    {
        for(int i=1; i<=n; ++i)
        {
            for(int j=1; j<=m; ++j)
            {
                if(j == k) System.out.print(arr.get(i - 1) + " ");
                else System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
