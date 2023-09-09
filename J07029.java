/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
public class J07029 {
    static int [] snt = new int[1000001];
    public static void sieve(){
        Arrays.fill(snt, 1);
        snt[0] = 0;
        snt[1] = 0;
        for(int i=2; i<=1000; ++i){
            if(snt[i] == 1)
                for(int j=i*i; j<=1000000; j+=i) snt[j] = 0;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> arr = (ArrayList<Integer>) ois.readObject();
        int [] cnt = new int [1000001];
        for(Integer x : arr){
            cnt[x] += snt[x];
        }
        int count = 0;
        for(int i=1000000; i>=2; --i){
            if(cnt[i] != 0){
                System.out.printf("%d %d\n", i, cnt[i]);
                ++count;
            }
            if(count == 10) break;
        }
        ois.close();
    }
}
