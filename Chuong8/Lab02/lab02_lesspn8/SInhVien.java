/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab02_lesspn8;

/**
 *
 * @author ADMIN
 */
public abstract class SInhVien {
     
    public String HoTen;
    public String NganhHoc;

    public SInhVien(String HoTen, String NganhHoc) {
        this.HoTen = HoTen;
        this.NganhHoc = NganhHoc;
    }
     public SInhVien() {
    }

    public abstract double getDiem();

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }

    public String getHocLuc() {
        if (getDiem() < 4.0) {
            return "Yeu";
        } else if (getDiem() < 6.0) {
            return "Trung binh";
        } else if (getDiem() < 7.0) {
            return "Trung binh kha";
        } else if (getDiem() < 8.0) {
            return "Kha";
        } else if (getDiem() < 9.0) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

}
