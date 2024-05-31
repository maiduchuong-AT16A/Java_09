/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson08.hinhchunhat;

/**
 *
 * @author ACER
 */
public class HinhVuong extends HinhChuNhat{
    double canh;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(double canh, double dai, double rong) {
        super(dai, rong);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {
        return 4*canh; 
    }

    @Override
    public double getDienTich() {
        return canh*canh; 
    }

    @Override
    public String HienThiThongTin() {
        return String.format("HV(canh = %.6f): chu vi = %.3f, dien tich = %.3f",getCanh(),getChuVi(),getDienTich());
    }
    
    
    
    
    
}
