/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class MonHoc {
    
    private String ID, name;
    
    private int sotin;

    public MonHoc(String ID, String name, int sotin) {
        this.ID = ID;
        this.name = name;
        this.sotin = sotin;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String getName()
    {
        return name.trim();
    }
}
