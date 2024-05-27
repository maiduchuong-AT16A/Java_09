/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinhchunhat;

/**
 *
 * @author Admin
 */
public class hinhVuong extends HinhChuNhat {

    public double canh;

    public hinhVuong() {
    }

    public hinhVuong(double canh, double chieuDai, double chieuRong) {
        super(chieuDai, chieuRong);
        this.canh = canh;
    }

    public hinhVuong(double canh) {
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
        return 4 * getCanh();
    }

    @Override
    public double getDienTich() {
        return getCanh() * getCanh();
    }

    @Override
    public String hienThiThongTin() {
        return "HV(canh = " + String.format("%.6f",getCanh())+ "): chu vi = " 
                + String.format("%.3f", getChuVi())
                + ", dien tich = " 
                + String.format("%.3f",getDienTich());
    }
}