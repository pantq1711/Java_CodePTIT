/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
class Pair<T0, T1> {
    T0 first;
    T1 second;

    public Pair(T0 first, T1 second) {
        this.first = first;
        this.second = second;
    }
    boolean prime(int n){
        for(int i=2; i<=(int)Math.sqrt(n); ++i){
            if(n % i == 0) return false;
        }
        if(n > 1) return true;
        return false;
    }
    public boolean isPrime(){
        if(prime((Integer)this.first) && prime((Integer)this.second)) return true;
        return false;
    }
    
    @Override
    public String toString(){
        return this.first + " " + this.second;
    }
}
