/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject43;

/**
 *
 * @author dell-vip
 */
public class SinhVienATTT extends SinhVien{
    double diemMD;
    double diemLTAT;
    double diemDTS;

    public SinhVienATTT(String hoTen, String nganhHoc, double diemMD, double diemLTAT, double diemDTS) {
        super(hoTen, "ATTT");
        this.diemMD = diemMD;
        this.diemLTAT = diemLTAT;
        this.diemDTS = diemDTS;
    }   

    public SinhVienATTT() {
    }
    
    @Override
    public double getDiem(){
        return (diemMD*2+diemLTAT*2+diemDTS)/5;
    }
}
