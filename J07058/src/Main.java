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
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <MonThi> arr = new ArrayList<>();
        for(int i=1; i<=n; ++i){
            arr.add(new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<MonThi>(){
            @Override
            public int compare(MonThi o1, MonThi o2) {
                return o1.getID().compareTo(o2.getID());
            }
        });
        for(MonThi x : arr){
            x.Display();
        }
        sc.close();
    }
}
