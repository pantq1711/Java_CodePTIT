/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class LoaiPhong {
    
    private char kyhieu;
    
    private String ten;
    
    private int dongia;
    
    private double fee;
    
    
    public LoaiPhong(String line)
    {
        String [] words = line.trim().split("\\s+");
        kyhieu = words[0].charAt(0);
        ten = words[1];
        dongia = Integer.parseInt(words[2]);
        fee = Double.parseDouble(words[3]);
    }

    public char getKyhieu() {
        return kyhieu;
    }

    public int getDongia() {
        return dongia;
    }

    public double getFee() {
        return fee;
    }
    
    
}
