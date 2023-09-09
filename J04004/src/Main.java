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
        PhanSo p = new PhanSo(sc.nextInt(), sc.nextInt());
        PhanSo q = new PhanSo(sc.nextInt(), sc.nextInt());
        p.Sum(q);
        p.Display();
    }
}
