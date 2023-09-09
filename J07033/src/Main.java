/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(arr);
        for (SinhVien i : arr)
            System.out.println(i);
    }
}
//2
//B15DCKT150
//NGUYEN NGOC SON
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//NguyeN   TrONg Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
