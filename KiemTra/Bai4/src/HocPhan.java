/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class HocPhan implements Comparable<HocPhan>{
    public static int cnt = 0;
    
    private String IDHP, ID;
    
    private int ngay, kip;
    
    private String nameGV, PH, nameMH;

    public HocPhan(String ID, int ngay, int kip, String nameGV, String PH) {
        this.IDHP = String.format("HP%03d", ++cnt);
        this.ID = ID;
        this.ngay = ngay;
        this.kip = kip;
        this.nameGV = nameGV;
        this.PH = PH;
        this.nameMH = "";
    }
    public void setNameMH(String n)
    {
        nameMH = n;
    }
    @Override
    public int compareTo(HocPhan o)
    {
        if(this.ngay == o.ngay)
        {
            if(this.kip == o.kip) return this.nameGV.compareTo(o.nameGV);
            return this.kip - o.kip;
        }
        return this.ngay - o.ngay;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String getNameMH()
    {
        return nameMH;
    }
    @Override
    public String toString()
    {
        return IDHP + " " + ngay + " " + kip + " " + nameGV + " " +  PH;
    }
}
