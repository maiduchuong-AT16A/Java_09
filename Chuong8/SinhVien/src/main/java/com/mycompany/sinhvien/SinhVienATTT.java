/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvien;

/**
 *
 * @author Admin
 */
public class SinhVienATTT extends SinhVien {

    public double MaDoc;
    public double LapTrinhAnToanSo;
    public double DieuTraSo;

    public SinhVienATTT() {
    }

    public SinhVienATTT(String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
    }

    public SinhVienATTT(double MaDoc, double LapTrinhAnToanSo, double DieuTraSo, String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
        this.MaDoc = MaDoc;
        this.LapTrinhAnToanSo = LapTrinhAnToanSo;
        this.DieuTraSo = DieuTraSo;
    }

    public double getMaDoc() {
        return MaDoc;
    }

    public void setMaDoc(double MaDoc) {
        this.MaDoc = MaDoc;
    }

    public double getLapTrinhAnToanSo() {
        return LapTrinhAnToanSo;
    }

    public void setLapTrinhAnToanSo(double LapTrinhAnToanSo) {
        this.LapTrinhAnToanSo = LapTrinhAnToanSo;
    }

    public double getDieuTraSo() {
        return DieuTraSo;
    }

    public void setDieuTraSo(double DieuTraSo) {
        this.DieuTraSo = DieuTraSo;
    }

    @Override
    public double getDiem() {
        return (getMaDoc() * 2
                + getLapTrinhAnToanSo() * 2
                + getDieuTraSo()) / 5;
    }

    public String hienThiThongTin() {
        return "SV: " + String.format("%-20s", getHoTen())
                + "- " + getNganhHoc() + " - "
                + String.format("%.2f", getDiem())
                + " - " + getHocLuc();
    }

}
