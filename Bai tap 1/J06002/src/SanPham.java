public class SanPham {
    
    private String ID, name;
    
    private int price1, price2;

    public SanPham(String ID, String name, int price1, int price2) {
        this.ID = ID;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice1() {
        return price1;
    }

    public int getPrice2() {
        return price2;
    }
    
    
}
