
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class KhachHang implements Comparable<KhachHang>{
    
    private static boolean check = false;
    
    private static int cnt = 0;
    
    private String id;
    
    
    private String name, ID;
    
    private LocalDate start, end;
    
    private int dongia, songay;
    
    private double fee;
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public KhachHang(String name, String ID, String start, String end) {
        this.id = String.format("KH%02d", ++cnt);
        this.name = name;
        this.ID = ID;
        this.start = LocalDate.parse(start, dtf);
        this.end = LocalDate.parse(end, dtf);
        this.songay = (int) ChronoUnit.DAYS.between(this.start, this.end);
        if(this.songay == 0) 
        {
            this.songay = 1;
            check = true;
        }
    }
    
    public void setDonGia(int n)
    {
        dongia = n;
    }
    
    public void setFee(double n)
    {
        fee = n;
    }
    
    public char getKyHieu()
    {
        return this.ID.charAt(2);
    }
    
    private double discount()
    {
        int s = songay;
        if(s < 10) return 0;
        else if(s >= 10 && s < 20) return 0.02;
        else if(s >= 20 && s < 30) return 0.04;
        else return 0.06;
    }
    
    public double tongtien()
    {
        return dongia * songay * (1 - discount()) * ( 1 + fee);
    }
    
    @Override
    public int compareTo(KhachHang o)
    {
        return o.songay - this.songay;
    }
    
    @Override
    public String toString()
    {
        String res = id + " " + name + " " + ID + " ";
        if(check == true) res += "0";
        else res += songay;
        res += " " + String.format("%.2f", tongtien());
        return res;
    }
}
