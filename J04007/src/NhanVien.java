/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class NhanVien {
    private String ID, Name, Date_of_birth, Address, Sex, Date_of_contract, Tax_ID;
    NhanVien(String name, String sex, String date_of_birth, String address, String tax_ID, String date_of_contract){
        this.ID = "00001";;
        this.Name = name;
        this.Sex = sex;
        this.Address = address;
        this.Date_of_birth = date_of_birth;
        this.Tax_ID = tax_ID;
        this.Date_of_contract = date_of_contract;
    }
    public void display(){
        System.out.println(this.ID + " " + this.Name + " " + this.Sex + " " + this.Date_of_birth + " " + this.Address + " " + this.Tax_ID + " " + this.Date_of_contract);
}
}
