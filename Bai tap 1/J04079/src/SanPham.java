/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class SanPham {
    private String ID, name;
    
    private int price, months;

    public SanPham(String ID, String name, int price, int months) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.months = months;
    }

    public String getID() {
        return ID;
    }

    public int getPrice() {
        return price;
    }

    public int getMonths() {
        return months;
    }
    
    
}
