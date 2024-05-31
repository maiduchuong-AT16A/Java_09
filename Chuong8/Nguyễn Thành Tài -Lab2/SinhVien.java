/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javacore.basic.lesson08.sinhvien;

/**
 *
 * @author ACER
 */
public abstract class SinhVien {

    public String HoTen;
    public String NganhHoc;

    public SinhVien(String HoTen, String NganhHoc) {
        this.HoTen = HoTen;
        this.NganhHoc = NganhHoc;
    }
    public abstract double getDiem();

    public String getHoTen() {
        return HoTen;
    }

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }
    public String getHocLuc(){
        if(getDiem() < 4.0){
            return "Yeu";
        }else if(getDiem() >= 4.0 && getDiem() <= 6.0){
            return "Trung binh";
        }else if(getDiem() >= 6.0 && getDiem() <= 7.0){
            return "Trung binh kha";
        }else if(getDiem() >= 7.0 && getDiem() <= 8.0){
            return "Kha";
        }else if(getDiem() >= 8.0 && getDiem() < 9.0){
            return "Gioi";
        }else{
        
            return "Xuat xac";
        }
    }

    @Override
    public String toString() {
        return "SV: " + String.format("%-20s",getHoTen()) + " - " + NganhHoc + " - " + String.format("%.02f", getDiem())+ " - " + getHocLuc();
    }
    
    
}
