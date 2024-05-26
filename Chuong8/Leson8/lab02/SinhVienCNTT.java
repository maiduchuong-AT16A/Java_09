/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

/**
 *
 * @author Admin
 */
public class SinhVienCNTT extends SinhVien {

    private double web;
    private double android;
    private double nhung;

    public SinhVienCNTT(String hoten) {
        super(hoten, "CNTT");
    }

    @Override
    public double getDiem() {
        return (web + android * 2 + nhung * 2) / 5;
    }

    public SinhVienCNTT(double web, double android, double nhung, String hoten, String nganhHoc) {
        super(hoten, nganhHoc);
        this.web = web;
        this.android = android;
        this.nhung = nhung;
    }

    public double getNhung() {
        return nhung;
    }

    public void setNhung(double nhung) {
        this.nhung = nhung;
    }

    public double getWeb() {
        return web;
    }

    public void setWeb(double web) {
        this.web = web;
    }

    public double getAndroid() {
        return android;
    }

    public void setAndroid(double android) {
        this.android = android;
    }

}
