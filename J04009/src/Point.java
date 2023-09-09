/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anphan
 */
import java.util.*;
public class Point {
    private double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double dist(Point a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
    public boolean Is_Triangle(Point a, Point b){
        double x1 = this.dist(a), x2 = this.dist(b), x3 = a.dist(b);
        if(x1 + x2 > x3 && x2 + x3 > x1 && x1 + x3 > x2) return true;
        else return false;
    }
    public void Area_with_Heron(Point a, Point b){
        if(this.Is_Triangle(a, b) == true){
            double c1 = this.dist(a), c2 = this.dist(b), c3 = a.dist(b);
            double area = Math.sqrt((c1 + c2 + c3) * (c1 + c2 - c3) * (-c1 + c2 + c3) * (c1 -c2 + c3)) / 4;
            System.out.printf("%.2f\n", area);
        }
        else System.out.println("INVALID");
    }
}
