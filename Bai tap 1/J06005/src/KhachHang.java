/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class KhachHang {
    
    private static int cnt = 0;
    
    private String ID, name, gender, dateOfBirth, address;

    public KhachHang(String name, String gender, String dateOfBirth, String address) {
        this.ID = String.format("KH%03d", ++cnt);
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    
}
