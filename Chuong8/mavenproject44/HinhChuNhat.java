/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject44;

/**
 *
 * @author dell-vip
 */
public class HinhChuNhat {

    double chieuDai;
    double chieuRong;

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
        return 2 * (getChieuDai() + getChieuRong());
    }

    public double getDienTich() {
        return chieuDai * chieuRong;
    }

    public void hienThiThongTin() {
        System.out.printf("HCN(%.6f, %.6f): chu vi = %.3f, dien tich = %.3f\n", chieuDai, chieuRong, getChuVi(), getDienTich());
    }
}
