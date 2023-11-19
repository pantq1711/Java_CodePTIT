
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class GiaoDichVang {
    
    private String ID_V;
    
    private Date ngay_V;

    public String getID_V() {
        return ID_V;
    }

    public String getNgay_V() {
        return ngay_V.toString();
    }
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private int dongia, sl;
    
    private String loai_V;

    public GiaoDichVang(String ID_V, String ngay_V, int dongia, int sL, String loai_V) throws ParseException {
        this.ID_V = ID_V;
        this.ngay_V = sdf.parse(ngay_V);
        this.dongia = dongia;
        this.sl = sL;
        this.loai_V = loai_V;
    }
    
    public int getTongTien()
    {
        return sl * dongia;
    }
    
    @Override
    public String toString()
    {
        String res = "";
        res = ID_V + " " + sdf.format(ngay_V) + " " + dongia + " " + sl + " " + loai_V + " " + getTongTien();
        return res;
    }
}
