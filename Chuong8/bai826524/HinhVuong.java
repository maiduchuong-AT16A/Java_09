/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai826524;

/**
 *
 * @author Admin
 */
public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong() {
        super();
    }

    public HinhVuong(double canh) {
        super();
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi(){
        return (4*this.getCanh());
    }
    @Override
    public double getDienTich(){
        return (this.canh*this.canh);
    }
    @Override
    public void hienthithongtin(){
        System.out.printf("HV(canh = %.6f):",getCanh());
        System.out.printf("chu vi = %.3f,",getChuVi());
        System.out.printf("dien tich = %.3f",getDienTich());
        System.out.println("");
    }
    
    
}
