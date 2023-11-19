/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class GiangVien {
    
    private String ID, name;
    
    private double diemchuan;

    public GiangVien(String line) {
        
        String [] words = line.trim().split("\\s+");
        this.ID = words[0];
        this.name = "";
        for(int i=1; i<words.length; ++i) this.name += words[i] + " ";
        this.name = name.trim();
        diemchuan = 0;
    }
    
    public String getID()
    {
        return ID;
    }
    public void setDiem(double n)
    {
        diemchuan += n;
    }
    
    @Override
    public String toString()
    {
        return name + " " + String.format("%.2f", diemchuan);
    }
}
