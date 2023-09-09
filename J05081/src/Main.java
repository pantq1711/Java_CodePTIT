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
        ArrayList <MatHang> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1; i<=n; ++i){
            sc.nextLine();
            arr.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getProfit() == o2.getProfit()){
                    return o1.getID().compareTo(o2.getID());
                }
                return o2.getProfit() - o1.getProfit();
            }
        });
        for(MatHang x : arr){
            x.Display();
        }
    }
}
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
