public class HoaDon implements  Comparable<HoaDon>{
    
    private static int cnt = 0;
    
    private String line, ID, name;
    
    private int SL, price1, price2;
    
    private char c;

    public void setP1(int n)
    {
        price1 = n;
    }
    
    public void setP2(int n)
    {
        price2 = n;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public String getID()
    {
        return ID.substring(0,2);
    }
    
    public String getLine()
    {
        return line;
    }
    
    public HoaDon(String line) {
        this.line = line;
        String [] words = line.trim().split("\\s+");
        ID = words[0] + String.format("-%03d", ++cnt);
        SL = Integer.parseInt(words[1]);
        c = ID.charAt(2);
        name = "";
    }
   
    private double giamgia()
    {
        if(SL >= 150) return 0.5;
        else if(SL >= 100) return 0.3;
        else if(SL >= 50) return 0.15;
        else return 0;
    }
    
    private long tongtien()
    {
        long tongtien = SL;
        tongtien *= (c == '1') ? price1 : price2;
        return tongtien;
    }
    private long tiengiamgia()
    {
        return (long)(Math.round(giamgia() * tongtien()));        
    }

    private long tienphaitra()
    {
        return (long)(tongtien() - tiengiamgia());
    }
    
    @Override
    public int compareTo(HoaDon o)
    {
        if(this.tienphaitra() > o.tienphaitra()) return -1;
        else return 1;
    }
    @Override
    public String toString()
    {
        return ID + " " + name + " " + String.format("%d %d", tiengiamgia(), tienphaitra()) ;
    }
}
