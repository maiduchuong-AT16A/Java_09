/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hinhchunhat;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {

    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {

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
        return 2 * getChieuDai() + 2 * getChieuRong();
    }

    public double getDienTich() {
        return getChieuDai() * getChieuRong();
    }

    public String hienThiThongTin() {
        return "HCN(" + String.format("%.6f", getChieuDai()) + ", " 
                + String.format("%.6f",getChieuRong()) + "): chu vi = " 
                + String.format("%.3f", getChuVi())
                + ", dien tich = " 
                + String.format("%.3f",getDienTich());
    }

}
