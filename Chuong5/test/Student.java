/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
import java.lang.Math;
public class Student {
    String maSinhVien;
    double diemTb;
    int namSinh;
    String lop;
    
    public Student()
    {
        
    }
    
    public Student(String maSinhVien, double diemTb, int namSinh, String lop)
    {
       this.maSinhVien = maSinhVien;
       this.diemTb = diemTb;
       this.namSinh = namSinh;
       this.lop = lop;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        this.maSinhVien = sc.nextLine();
        this.diemTb = sc.nextDouble();
        this.namSinh = sc.nextInt();
        sc.nextLine();
        this.lop = sc.nextLine();
    }
    
    void output()
    {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Diem trung binh: " + diemTb);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Lop: " + lop);
    }
    
    boolean checkScholarship()
    {
        if(diemTb >= 8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
