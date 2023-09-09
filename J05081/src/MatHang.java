/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class MatHang {
    private String ID, Name, Unit;
    private int Price_of_buy, Price_of_sell;

    public MatHang(int ID, String Name, String Unit, int Price_of_buy, int Price_of_sell) {
        this.ID = "MH" + String.format("%03d", ID);
        this.Name = Name;
        this.Unit = Unit;
        this.Price_of_buy = Price_of_buy;
        this.Price_of_sell = Price_of_sell;
    }

    public String getID() {
        return ID;
    }

    public int getProfit(){
        return this.Price_of_sell - this.Price_of_buy;
    }
    public void Display(){
        System.out.println(this.ID + " " + this.Name + " " + this.Unit + " " + this.Price_of_buy + " " + this.Price_of_sell + " " + this.getProfit());
    }
}
