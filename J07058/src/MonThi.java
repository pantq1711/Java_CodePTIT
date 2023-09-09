/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class MonThi {
    private String ID, Name, Form;
    public MonThi(String ID, String Name, String Form) {
        this.ID = ID;
        this.Name = Name;
        this.Form = Form;
    }
    public String getID(){
        return this.ID;
    }
    public void Display(){
        System.out.println(this.ID + " " + this.Name + " " + this.Form);
    }
}
