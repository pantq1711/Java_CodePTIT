/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class MatHang {
    
    private static int cnt = 0;
    
    private String ID, name, donVi;
    
    private int giaMua, giaBan;

    public MatHang(String name, String donVi, int giaMua, int giaBan) {
        this.ID = String.format("MH%03d", ++cnt);
        this.name = name;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
    
    
}
