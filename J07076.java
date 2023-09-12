/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class J07076 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int n = sc.nextInt(), m = sc.nextInt() , k = sc.nextInt();
            int [][] arr = new int[n + 1][m + 1];
            ArrayList <Integer> a = new ArrayList<>();

            for(int i=1; i<=n; ++i){
                for(int j=1; j<=m; ++j){
                    arr[i][j] = sc.nextInt();
                    if(j == k) a.add(arr[i][j]);
                }
            }
            
            Collections.sort(a);
            
            for(int i=1; i<=n; ++i){
                for(int j=1; j<=m; ++j){
                    if(j == k)
                    {
                        System.out.print(a.get(i - 1) + " ");
                    }
                    else 
                    {
                        System.out.print(arr[i][j] + " ");
                         
                    }
                }
                System.out.println();
            }
        }
    }
}
