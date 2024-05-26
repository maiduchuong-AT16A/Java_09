/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

/**
 *
 * @author Admin
 */
public abstract class SinhVien {

    private String hoten;
    private String nganhHoc;

    public SinhVien(String hoten, String nganhHoc) {
        this.hoten = hoten;
        this.nganhHoc = nganhHoc;
    }

    public abstract double getDiem();

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getHocLuc() {
        if (getDiem() >= 4.0 && getDiem() < 6.0) {
            return "Trung binh";
        } else if (getDiem() >= 6.0 && getDiem() < 7.0) {
            return "Trung binh kha";
        } else if (getDiem() >= 7.0 && getDiem() < 8.0) {
            return "Kha";
        } else if (getDiem() >= 8.0 && getDiem() < 9.0) {
            return "Gioi";

        } else if (getDiem() >= 9.0) {
            return "Xuat sac";
        } else if (getDiem() < 4.0) {
            return "Yeu";
        } else {
            return " ";
        }
    }

    public String hienThiThongTin() {
        return "SV: " + String.format("%-20s", getHoten()) + " – " + nganhHoc + " – " + String.format("%.2f", getDiem()) + " – " + getHocLuc();
    }

}
