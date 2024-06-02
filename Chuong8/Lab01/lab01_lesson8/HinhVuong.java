/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01_lesson8;

/**
 *
 * @author ADMIN
 */
public class HinhVuong extends HinhChuNhat{
    
     public HinhVuong(double Canh) {
        super(Canh, Canh);
    }

    public HinhVuong() {
    }

    public void setCanh(double Canh) {
        super.ChieuDai = super.ChieuRong = Canh;
    }

    public double getCanh() {
        return super.ChieuDai;
    }

    public double getChuVi() {
        return super.ChieuDai *4;
    }

    public double getDienTich() {
        return super.ChieuDai * super.ChieuRong;
    }

    public void hienThiThongTin() {
        System.out.printf("HV(canh = %f): chu vi = %.3f, dien tich = %.3f\n", getCanh(), getChuVi(), getDienTich());
    }
}
