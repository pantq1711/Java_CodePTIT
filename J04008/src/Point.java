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
    Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    public double dist(Point a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
    public double Is_Triangle(Point a, Point b){
        double x1 = this.dist(a), x2 = this.dist(b), x3 = a.dist(b);
        if(x1 + x2 > x3 && x2 + x3 > x1 && x1 + x3 > x2) return x1 + x2 + x3;
        else return -1;
    }
    public void Display(Point a, Point b){
        if(this.Is_Triangle(a, b) == -1) System.out.println("INVALID");
        else
        System.out.printf("%.3f\n", this.Is_Triangle(a, b));
    }
}
