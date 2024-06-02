/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_lesspn8;

/**
 *
 * @author ADMIN
 */
public class SinhVienDTVT extends SInhVien {

    public double TruyenDanSo;
    public double ThietKeModule;
    public double ViDieuKhien;

    public SinhVienDTVT() {
    }

    public SinhVienDTVT(String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
    }

    public SinhVienDTVT(double TruyenDanSo, double ThietKeModule, double ViDieuKhien, String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
        this.TruyenDanSo = TruyenDanSo;
        this.ThietKeModule = ThietKeModule;
        this.ViDieuKhien = ViDieuKhien;
    }

    public double getTruyenDanSo() {
        return TruyenDanSo;
    }

    public void setTruyenDanSo(double TruyenDanSo) {
        this.TruyenDanSo = TruyenDanSo;
    }

    public double getThietKeModule() {
        return ThietKeModule;
    }

    public void setThietKeModule(double ThietKeModule) {
        this.ThietKeModule = ThietKeModule;
    }

    public double getViDieuKhien() {
        return ViDieuKhien;
    }

    public void setViDieuKhien(double ViDieuKhien) {
        this.ViDieuKhien = ViDieuKhien;
    }

    @Override
    public double getDiem() {
        return (getViDieuKhien() * 2 + getTruyenDanSo() + getThietKeModule()) / 4;
    }

    public String hienThiThongTin() {
        return "SV: " + String.format("%-15s", getHoTen()) + "- " + getNganhHoc() + " - " + String.format("%.2f", getDiem()) + " - " + getHocLuc();
    }
}
