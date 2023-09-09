/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
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
    public void rutgon(PhanSo a){
        long gcd = GCD(a.tu, a.mau);
        a.tu /= gcd;
        a.mau /= gcd;
    }
    public void Sum(PhanSo a){
        long LCM = this.mau * a.mau;
        long tu_chung = this.tu * a.mau + this.mau * a.tu;
        long gcd = GCD(LCM, tu_chung);
        this.mau = LCM / gcd;
        this.tu = tu_chung /gcd;
    }
    public void Display(){
        System.out.printf("%d/%d", this.tu, this.mau);
    }
}
