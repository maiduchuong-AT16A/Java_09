/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double getChuVi() {
        return (chieuDai + chieuRong)*2;
    }
    public double getDienTich() {
        return chieuDai*chieuRong;
    }
    public String hienThiThongTin() {
        return "HCN("+String.format("%.6f", chieuDai)+", "+ String.format("%.6f", chieuRong)+"): chu vi = "+String.format("%.3f", getChuVi())+", dien tich = "+String.format("%.3f", getDienTich());
    }
    
    
}
