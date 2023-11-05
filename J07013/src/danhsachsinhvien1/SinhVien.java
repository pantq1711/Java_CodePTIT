/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

/**
 *
 * @author Anphan
 */
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien(int id, String ten, String lop, String date, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return ma + " " +  ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}