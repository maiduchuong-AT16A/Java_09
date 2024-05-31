/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_8;

/**
 *
 * @author quanm
 */
public class SinhVienDTVT extends SinhVien{
    protected double diemTDS, diemTKModule, diemVDK;
    public SinhVienDTVT(String hoTen, String nganhHoc, double diemTDS, double diemTKModule, double diemVDK){
        super(hoTen, nganhHoc);
        this.diemTDS = diemTDS; this.diemTKModule = diemTKModule; this.diemVDK = diemVDK;
    }
    public double getDiem(){
        return (this.diemVDK * 2 + this.diemTDS + diemTKModule) / 4;
    }
}
