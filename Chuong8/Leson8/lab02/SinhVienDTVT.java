/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

/**
 *
 * @author Admin
 */
public class SinhVienDTVT extends SinhVien {

    private double diemTDS;
    private double diemTKModule;
    private double diemVDK;

    public SinhVienDTVT(String hoten) {
        super(hoten, "DTVT");
    }

    @Override
    public double getDiem() {
        return (diemVDK * 2 + diemTDS + diemTKModule) / 4;
    }

    public double getDiemTDS() {
        return diemTDS;
    }

    public void setDiemTDS(double diemTDS) {
        this.diemTDS = diemTDS;
    }

    public double getDiemTKModule() {
        return diemTKModule;
    }

    public void setDiemTKModule(double diemTKModule) {
        this.diemTKModule = diemTKModule;
    }

    public double getDiemVDK() {
        return diemVDK;
    }

    public void setDiemVDK(double diemVDK) {
        this.diemVDK = diemVDK;
    }
    

}
