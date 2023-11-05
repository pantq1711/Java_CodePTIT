/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class SinhVien implements Comparable <SinhVien> {
    
    private String ID, name, lop, email, SDT;

    public SinhVien(String ID, String name, String lop, String email, String SDT) {
        this.ID = ID;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.SDT = "0" + SDT;
    }
    
    public String getSDT()
    {
        return SDT;
    }
    @Override
    public int compareTo(SinhVien o)
    {
        return this.ID.compareTo(o.ID);
    }
    
    @Override
    public String toString()
    {
        return ID + " " + name;
    }
}
