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

    public MonHoc(String line) {
        String [] words = line.trim().split("\\s+");
        this.ID = words[0];
        for(int i=1; i<words.length; ++i) this.name += words[i] + " ";
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    
    
}
