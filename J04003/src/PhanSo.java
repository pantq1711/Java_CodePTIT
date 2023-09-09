import java.util.*;
public class PhanSo {
    private long tu, mau;
    PhanSo(long a, long b){
        this.tu = a;
        this.mau = b;
    }
    public long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a % b);
    }
    public void rutgon(){
        long gcd = GCD(this.tu, this.mau);
        this.tu /= gcd;
        this.mau /= gcd;
    }
    public void display(){
        System.out.printf("%d/%d", this.tu, this.mau);
    }
}
