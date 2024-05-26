/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

/**
 *
 * @author Admin
 */
public class SinhVienATTT extends SinhVien {

    private double maDoc;
    private double lapTrinhAnToan;
    private double dieuTraSo;

    public SinhVienATTT(String hoten) {
        super(hoten, "ATTT");
    }

    @Override
    public double getDiem() {
        return (maDoc * 2 + lapTrinhAnToan * 2 + dieuTraSo) / 5;
    }

    public SinhVienATTT(double maDoc, double lapTrinhAnToan, double dieuTraSo, String hoten, String nganhHoc) {
        super(hoten, nganhHoc);
        this.maDoc = maDoc;
        this.lapTrinhAnToan = lapTrinhAnToan;
        this.dieuTraSo = dieuTraSo;
    }

    

    public double getDieuTraSo() {
        return dieuTraSo;
    }

    public void setDieuTraSo(double dieuTraSo) {
        this.dieuTraSo = dieuTraSo;
    }

    public double getMaDoc() {
        return maDoc;
    }

    public void setMaDoc(double maDoc) {
        this.maDoc = maDoc;
    }

    public double getLapTrinhAnToan() {
        return lapTrinhAnToan;
    }

    public void setLapTrinhAnToan(double lapTrinhAnToan) {
        this.lapTrinhAnToan = lapTrinhAnToan;
    }

}
