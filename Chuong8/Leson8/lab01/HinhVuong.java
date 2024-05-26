/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

/**
 *
 * @author Admin
 */
public class HinhVuong extends HinhChuNhat {
    private double canh;

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
        return canh*4; 
    }

    @Override
    public double getDienTich() {
        return canh*canh;
    }

    @Override
    public String hienThiThongTin() {
        return "HV(canh = "+String.format("%.6f", canh)+"): chu vi = "+String.format("%.3f", getChuVi())+", dien tich = "+String.format("%.3f", getDienTich());
    }
    
    
    
    
    
    
}
