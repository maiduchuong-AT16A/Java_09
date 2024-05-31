/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject44;

/**
 *
 * @author dell-vip
 */
public class HinhVuong extends HinhChuNhat {

    double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    
    

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {
        return 4 * canh;
    }

    @Override
    public double getDienTich() {
        return canh * canh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.printf("HV(canh = %.6f): chu vi = %.3f, dien tich = %.3f\n", canh, getChuVi(), getDienTich());
    }
}
