/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for(int i=1; i<=n; ++i){
            sc.nextLine();
            arr.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for(SinhVien x : arr) x.display();
        sc.close();
    }
}
//4
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19
//Nguyen Van An
//D20CQCN01-B
//2/12/2102
//3.19
//Nguyen Van An
//D20CQCN01-B
//2/12/1002
//3.19
//Nguyen Van An
//D20CQCN01-B
//22/12/2002
//3.15