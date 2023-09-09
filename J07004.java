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
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map <Integer, Integer> map = new TreeMap<>();
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            if(map.containsKey(x) == true){
                map.put(x, map.get(x) + 1);
            }
            else map.put(x, 1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry: entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
