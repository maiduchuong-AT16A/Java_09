/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson08.sinhvien;

/**
 *
 * @author ACER
 */
public class SinhVienCNTT extends SinhVien{
    
     double diemWeb;
     double diemAndroid;
      double diemNhung;

    public SinhVienCNTT(String HoTen) {
        super(HoTen, "CNTT");
    }

    @Override
    public double getDiem() {
        return (diemWeb+diemAndroid*2+diemNhung*2)/5;
    }

    public SinhVienCNTT(double diemWeb, double diemAndroid, double diemNhung, String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
        this.diemWeb = diemWeb;
        this.diemAndroid = diemAndroid;
        this.diemNhung = diemNhung;
    }


    @Override
    public String getNganhHoc() {
        return "CNTT";
    }

    public double getDiemWeb() {
        return diemWeb;
    }

    public double getDiemAndroid() {
        return diemAndroid;
    }

    public double getDiemNhung() {
        return diemNhung;
    }

    public void setDiemWeb(double diemWeb) {
        this.diemWeb = diemWeb;
    }

    public void setDiemAndroid(double diemAndroid) {
        this.diemAndroid = diemAndroid;
    }

    public void setDiemNhung(double diemNhung) {
        this.diemNhung = diemNhung;
    }


   

    @Override
    public String toString() {
        return super.toString(); 
    }
}
