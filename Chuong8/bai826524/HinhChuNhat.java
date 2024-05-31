/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai826524;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    double chieudai;
    double chieurong;

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public HinhChuNhat() {
    }

    public double getChieudai() {
        return chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    public double getChuVi(){
        return 2*(this.chieudai+this.chieurong);
    }
    public double getDienTich(){
        return (this.chieudai*this.chieurong);
    } 
    public void hienthithongtin(){
        System.out.printf("HCN(%.6f,%.6f):",this.chieudai,this.chieurong);
        System.out.printf("chu vi = %.3f),",getChuVi());
        System.out.printf("dien tich = %.3f",getDienTich());
        System.out.println("");
    }
    
    
}
