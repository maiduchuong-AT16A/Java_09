/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject43;

/**
 *
 * @author dell-vip
 */
public class SinhVienDTVT extends SinhVien{
    double diemTDS;
    double diemTKModule;
    double diemVDK;

    public SinhVienDTVT(String hoTen, String nganhHoc, double diemTDS, double diemTKModule, double diemVDK) {
        super(hoTen, "DTVT");
        this.diemTDS = diemTDS;
        this.diemTKModule = diemTKModule;
        this.diemVDK = diemVDK;
    }

    public SinhVienDTVT() {
    }
    
    
    @Override
    public double getDiem(){
        return (diemVDK*2+diemTDS+diemTKModule)/4;
    }
}
