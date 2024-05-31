/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson08.sinhvien;

/**
 *
 * @author ACER
 */
public class SinhVienDTVT extends SinhVien{
    
double diemVDK;
double diemTDS;
double diemTKModule;

    public SinhVienDTVT(String HoTen) {
        super(HoTen, "DTVT");
    }
 @Override
    public double getDiem() {
        return (diemVDK*2+diemTDS+diemTKModule)/4;


    }

    public SinhVienDTVT(double diemVDK, double diemTDS, double diemTKModule, String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
        this.diemVDK = diemVDK;
        this.diemTDS = diemTDS;
        this.diemTKModule = diemTKModule;
    }

    public double getDiemVDK() {
        return diemVDK;
    }

    public double getDiemTDS() {
        return diemTDS;
    }

    public double getDiemTKModule() {
        return diemTKModule;
    }

    public void setDiemVDK(double diemVDK) {
        this.diemVDK = diemVDK;
    }

    public void setDiemTDS(double diemTDS) {
        this.diemTDS = diemTDS;
    }

    public void setDiemTKModule(double diemTKModule) {
        this.diemTKModule = diemTKModule;
    }




   

    @Override
    public String toString() {
        return super.toString(); 
    }
}
