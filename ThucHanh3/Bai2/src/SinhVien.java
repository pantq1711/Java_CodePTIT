
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
public class SinhVien implements Comparable<SinhVien> {
    
    private String name;
    
    private int mins;
    
    LocalDate startDate, endDate;
    
    LocalTime startDuration, endDuration;
    
    DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public SinhVien(String name, String line1, String line2) {
        this.name = name;
        String [] words1 = line1.trim().split("\\s+");
        String [] words2 = line2.trim().split("\\s+");
        this.startDate = LocalDate.parse(words1[0], dtf);
        this.endDate = LocalDate.parse(words2[0], dtf);
        this.startDuration = LocalTime.parse(words1[1], time);
        this.endDuration = LocalTime.parse(words2[1], time);
        mins = (int) ChronoUnit.DAYS.between(startDate, endDate) * 24 * 60;
        mins += (int) Duration.between(startDuration, endDuration).toMinutes();
    }
    
    @Override
    public int compareTo(SinhVien o)
    {
        if(this.mins == o.mins) return this.name.compareTo(o.name);
        return o.mins - this.mins;
    }
    
    @Override
    public String toString()
    {
        return name + " " + mins;
    }
}
