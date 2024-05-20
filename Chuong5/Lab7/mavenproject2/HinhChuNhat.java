/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    double a;
    double b;

    public HinhChuNhat() {
        super();
    }

    public HinhChuNhat(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }
    void nhapthongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap thong tin hinh chu nhat");
        System.out.println("nhap vao chieu dai:");
        a=sc.nextDouble();
        System.out.println("nhap vao chieu rong:");
        b=sc.nextDouble();
    }
    double tinhchuvi(){
        double p=2*(a+b);
        return p;
    }
    double tinhdientich(){
        double s=a*b;
        return s;
    }
}
