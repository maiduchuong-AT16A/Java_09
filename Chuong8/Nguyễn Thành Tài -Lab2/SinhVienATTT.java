/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson08.sinhvien;

/**
 *
 * @author ACER
 */
public class SinhVienATTT extends SinhVien{
    
    double diemMD;
    double diemLTAT;
    double diemDTS;

    public SinhVienATTT(String HoTen) {
        super(HoTen,"ATTT");
    }

    public SinhVienATTT(double diemMD, double diemLTAT, double diemDTS, String HoTen, String NganhHoc) {
        super(HoTen, NganhHoc);
        this.diemMD = diemMD;
        this.diemLTAT = diemLTAT;
        this.diemDTS = diemDTS;
    }

    @Override
    public double getDiem() {
        return (diemMD*2+diemLTAT*2+diemDTS)/5;
    }

    @Override
    public String getHoTen() {
        return super.getHoTen(); 
    }

  
    public double getDiemMD() {
        return diemMD;
    }

    public double getDiemLTAT() {
        return diemLTAT;
    }

    public double getDiemDTS() {
        return diemDTS;
    }

    public void setDiemMD(double diemMD) {
        this.diemMD = diemMD;
    }

    public void setDiemLTAT(double diemLTAT) {
        this.diemLTAT = diemLTAT;
    }

    public void setDiemDTS(double diemDTS) {
        this.diemDTS = diemDTS;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }

  

    @Override
    public String toString() {
        return super.toString(); 
    }
    

  
    
    
    
    
}
