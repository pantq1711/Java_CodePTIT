/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class HocPhan {
    
    private String IDGV, IDMH;
    
    private double diemchuan;

    public HocPhan(String line) {
        
        String [] words = line.trim().split("\\s+");
        IDGV = words[0];
        IDMH = words[1];
        diemchuan = Double.parseDouble(words[2]);
    }

    public String getIDGV() {
        return IDGV;
    }

    public String getIDMH() {
        return IDMH;
    }

    public double getDiemchuan() {
        return diemchuan;
    }
    
    
}
