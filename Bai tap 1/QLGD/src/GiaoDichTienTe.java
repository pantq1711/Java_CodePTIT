
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class GiaoDichTienTe {
    
    private String ID_TT;
    
    private Date ngay_TT;
    
    public String getID_TT()
    {
        return ID_TT;
    }
    
    public String getNgay_TT()
    {
        return ngay_TT.toString();
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private int dongia, sl;
    
    private double tigia;
    
    private String loai_TT;

    public GiaoDichTienTe(String ID_TT, String ngay_TT, int dongia, int sl, double tigia, String loai_TT) throws ParseException {
        this.ID_TT = ID_TT;
        this.ngay_TT = sdf.parse(ngay_TT);
        this.dongia = dongia;
        this.sl = sl;
        this.loai_TT = loai_TT;
        this.tigia = tigia;
    }
    
    
    
    public double getTongTien()
    {
        double res = sl * dongia;
        if(loai_TT.equals("VN")) return res;
        else return res * tigia;
    }
   
    @Override
    public String toString()
    {
        String res = "";
        res = ID_TT + " " + sdf.format(ngay_TT) + " " + dongia + " " + sl + " " + tigia + " "+ loai_TT + " " + String.format("%.2f",getTongTien());
        return res;
    }
}
