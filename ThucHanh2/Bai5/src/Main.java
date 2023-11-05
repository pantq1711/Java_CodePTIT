/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.format.DateTimeParseException;
public class Main {
    
    public static boolean check(String s)
    {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
       try {
           LocalTime time = LocalTime.parse(s, dtf);
           return true;
       }
       catch(DateTimeParseException e)
       {
           return false;
       }
    }
    
    public static void main(String[] args) {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set <String> set = new TreeSet <>();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss");
        String line;
        String words = "";
        try {
            while((line = reader.readLine()) != null) {
                words += line + " ";
            }
        }
        catch(IOException e)
        {
            
        }
        String [] parts = words.split("[\\s,.;]+");
        for(String x : parts) 
        {
            if(check(x)) set.add(x.trim());
        }
        for(String x : set)
        {
            System.out.println(x + " ");
        }
    }
}
