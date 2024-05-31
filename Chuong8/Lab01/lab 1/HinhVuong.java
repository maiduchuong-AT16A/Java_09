/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_8;

/**
 *
 * @author quanm
 */
public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
    }
    
    public HinhVuong(double canh){
        super(canh, canh);
    }
    
    public void setCanh(double canh){
        super.chieuDai = super.chieuRong = canh;
    }
    
    public double getCanh(){
        return super.chieuDai;
    }
    
    public double getChuVi(){
        return super.chieuDai * 4;
    }
    
    public double getDienTich(){
        return super.chieuDai * super.chieuRong;
    }
    
    public String hienThiThongTin(){
        return String.format("HV(canh = %f): chu vi = %.3f, dien tich = %.3f", getCanh(), getChuVi(), getDienTich());
    }
}
