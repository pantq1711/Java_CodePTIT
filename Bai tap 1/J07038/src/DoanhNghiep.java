/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class DoanhNghiep {
    
    private String IDDN, nameDN;
    
    private int SL;

    public DoanhNghiep(String IDDN, String nameDN, int SL) {
        this.IDDN = IDDN;
        this.nameDN = nameDN;
        this.SL = SL;
    }

    public String getIDDN() {
        return IDDN;
    }

    public String getNameDN() {
        return nameDN;
    }

    public int getSL() {
        return SL;
    }
    
    
}
