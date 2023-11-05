/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class User {
    
    private String name, pass, line;

    public User(String line) {
        String [] words = line.split("\\s+");
        this.name = words[0];
        this.pass = words[1];
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    
    
    
}
