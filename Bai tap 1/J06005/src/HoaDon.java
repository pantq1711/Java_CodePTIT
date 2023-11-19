/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class HoaDon implements Comparable<HoaDon>{
    
    private static int count = 0;
    private String ID;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(KhachHang khachHang, MatHang matHang, int soLuong) {
        this.ID = "HD" + String.format("%03d", ++count);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    private int loinhuan()
    {
        return (matHang.getGiaBan() - matHang.getGiaMua()) * soLuong;
    }
    
    @Override
    public int compareTo(HoaDon o)
    {
        return o.loinhuan() - this.loinhuan();
    }
    
    @Override
    public String toString()
    {
        return ID + " " + khachHang.getName() + " " + khachHang.getAddress() + " " + matHang.getName() + " " + soLuong + " " + matHang.getGiaBan() * soLuong + " " + loinhuan();
    }
}
