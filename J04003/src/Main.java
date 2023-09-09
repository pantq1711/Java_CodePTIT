import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
        a.rutgon();
        a.display();
    }
}
class PhanSo {
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

