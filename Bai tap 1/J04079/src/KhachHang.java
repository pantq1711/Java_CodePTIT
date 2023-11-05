
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Anphan
 */
public class KhachHang implements Comparable<KhachHang> {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private static int cnt = 0;

    private String ID, name, address, IDSP;

    private int quantity, month, totalMoney, price;

    private LocalDate buyDate;

    public KhachHang(String name, String address, String IDSP, int quantity, String buyDate) {
        this.ID = String.format("KH%02d", ++cnt);
        this.name = name;
        this.address = address;
        this.IDSP = IDSP;
        this.quantity = quantity;
        this.buyDate = LocalDate.parse(buyDate, dtf);
        this.totalMoney = quantity;
    }

    public void setMonth(int n) {
        this.buyDate = this.buyDate.plusMonths(n);
    }

    public void setPrice(int n) {
        totalMoney *= n;
    }
    
    public String getIDSP()
    {
        return IDSP;
    }
    
    @Override
    public int compareTo(KhachHang o) {
        if (this.buyDate.equals(o.buyDate)) {
            return this.ID.compareTo(o.ID);
        }
        return this.buyDate.compareTo(o.buyDate);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + address + " " + IDSP + " " + totalMoney + " " + dtf.format(buyDate);
    }
}
