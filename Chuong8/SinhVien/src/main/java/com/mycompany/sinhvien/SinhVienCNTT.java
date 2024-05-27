/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvien;

/**
 *
 * @author Admin
 */
public class SinhVienCNTT extends SinhVien {

    public double Web;
    public double Android;
    public double Nhung;

    public SinhVienCNTT() {
    }

    public SinhVienCNTT(String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
    }

    public SinhVienCNTT(double Web, double Android, double Nhung, String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
        this.Web = Web;
        this.Android = Android;
        this.Nhung = Nhung;
    }

    public double getWeb() {
        return Web;
    }

    public void setWeb(double Web) {
        this.Web = Web;
    }

    public double getAndroid() {
        return Android;
    }

    public void setAndroid(double Android) {
        this.Android = Android;
    }

    public double getNhung() {
        return Nhung;
    }

    public void setNhung(double Nhung) {
        this.Nhung = Nhung;
    }

    @Override
    public double getDiem() {
        return (getWeb() + getAndroid() * 2 + getNhung() * 2) / 5;
    }

    public String hienThiThongTin() {
        return "SV: " + String.format("%-20s", getHoTen())
                + "- " + getNganhHoc() + " - "
                + String.format("%.2f", getDiem())
                + " - " + getHocLuc();
    }
}
