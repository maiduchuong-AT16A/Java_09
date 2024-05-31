/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject43;

/**
 *
 * @author dell-vip
 */
public abstract class SinhVien {
    String hoTen;
    String nganhHoc;

    public SinhVien() {
    }    

    public SinhVien(String hoTen, String nganhHoc) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }
    public abstract double getDiem();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
    public String getHocLuc(){
        if(getDiem()<4.0){
            return "Yeu";
        }else if(4.0<= getDiem() && getDiem()<6.0){
            return "Trung binh";
        }else if(6.0<= getDiem() && getDiem()<7.0){
            return "Trung binh kha";
        }else if(7.0<= getDiem() && getDiem()<8.0){
            return "Kha";
        }else if(8.0<= getDiem() && getDiem()<9.0){
           return "Gioi";
        }else{
            return "Xuat sac";
        }
    }
    public void hienThiThongTin(){
        System.out.printf("SV: %-20s - %s - %.2f - %s\n", getHoTen(), getNganhHoc(), getDiem(), getHocLuc());
    }
}
