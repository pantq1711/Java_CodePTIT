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
        int n = sc.nextInt();
        ArrayList <Time> arr = new ArrayList<>();
        for(int i=1; i<=n; ++i){
            sc.nextLine();
            Time t = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(t);
        }
        Collections.sort(arr, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.getH() == o2.getH()){
                    if(o1.getM() == o2.getM()){
                        return o1.getS() - o2.getS();
                    }
                    return o1.getM() - o2.getM();
                }
                return o1.getH() - o2.getH();
            }
        });
        for(Time x : arr){
            x.display();
        }
    }
}
//3
//11 20 20
//14 20 14
//11 15 12
