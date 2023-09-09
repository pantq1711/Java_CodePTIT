/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Teacher {
    private String ID, Name;
    private long Wage; //phu cap
    Teacher(String id, String name, long wage){
        this.ID = id.substring(0,2).toUpperCase() + id.substring(2);
        this.Name = name;
        this.Wage = wage;
    }
    public int Allowance(){
        char c = this.ID.charAt(1);
        if(c == 'T') return 2000000;
        else if(c == 'P') return 900000;
        else return 500000;
    }
    public long final_wage(){
        String tmp = this.ID.substring(2);
        return (long) (Integer.parseInt(tmp)) * this.Wage + this.Allowance();
    }
    public void Display(){
        System.out.printf("%s %s %d %d %d", this.ID, this.Name, Integer.parseInt(this.ID.substring(2)), this.Allowance(), this.final_wage());
    }
}
