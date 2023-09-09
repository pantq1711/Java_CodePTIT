/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class J07015 {
    static int [] snt = new int[1000001];
    public static void sieve(){
        Arrays.fill(snt,1);
        snt[0]  = snt[1] = 0;
        for(int i=2; i<=1000; ++i){
            if(snt[i] == 1){
                for(int j=i*i; j<=1000000; j+=i) snt[j] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        int [] cnt = new int[1000001];
        for(Integer x : arr){
            cnt[x]++;
        }
        for(int i=2; i<=1000000; ++i){
            if(snt[i] == 1 && cnt[i] != 0){
                System.out.println(i + " " + cnt[i]);
            }
        }
        ois.close();        
    }
}
