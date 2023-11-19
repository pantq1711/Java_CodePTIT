/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class SinhVien implements Comparable<SinhVien>{
    
    private String ID, name, classNameString, email, IDDN;
    
    private int SL;
    
    private static String chuanhoa(String n)
    {
        String [] words = n.trim().split("\\s+");
        String res = "";
        for(String word : words)
        {
            res += word.toUpperCase().charAt(0) + word.toLowerCase().substring(1) + " ";
        }
        return res.trim();
    }

    public SinhVien(String ID, String name, String classNameString, String email) {
        this.ID = ID;
        this.name = chuanhoa(name);
        this.classNameString = classNameString;
        this.email = email;
        this.IDDN = "";
        SL = 0;
    }
    
    public void setSL()
    {
        ++SL;
    }
    
    public int getSL()
    {
        return SL;
    }
    
    public void setIDDN(String n)
    {
        IDDN = n;
    }
    
    public String getIDDN()
    {
        return IDDN;
    }
    
    public String getID()
    {
        return ID;
    }
    
    @Override
    public int compareTo(SinhVien o)
    {
        return ID.compareTo(o.ID);
    }
    @Override
    public String toString()
    {
        return ID + " " + name + " " + classNameString;
    }
}
