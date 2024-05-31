/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_8;

/**
 *
 * @author quanm
 */
public abstract class SinhVien {
    protected String hoTen, nganhHoc;
    public SinhVien(String hoTen, String nganhHoc){
        this.hoTen = hoTen; this.nganhHoc = nganhHoc;
    }
    
    public abstract double getDiem();
    
    public void setNganhHoc(String nganhHoc){
        this.nganhHoc = nganhHoc;
    }
    
    public String getNganhHoc(){
        return this.nganhHoc;
    }
    
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    public String getHoTen(){
        return this.hoTen;
    }
    
    public String getHocLuc(){
        if(getDiem() < 4)
        {
            return "Yeu";
        }
        else if(getDiem() >= 4 && getDiem() < 6)
        {
            return "Trung binh";
        }
        else if(getDiem() >= 6 && getDiem() < 7)
        {
            return "Trung binh kha";
        }
        else if(getDiem() >= 7 && getDiem() < 8)
        {
            return "Kha";
        }
        else if(getDiem() >= 8 && getDiem() < 9)
        {
            return "Gioi";
        }
        return "Xuat sac";
    }
    
    public String hienThiThongTin(){
        return String.format("SV: %-20s - %s - %f - %s", getHoTen(), getNganhHoc(), getDiem(), getHocLuc());
    }
}