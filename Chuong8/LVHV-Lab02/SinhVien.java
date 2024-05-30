/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

/**
 *
 * @author van
 */
public abstract class SinhVien {

    String Hoten;
    String nganhHoc;

    public SinhVien(String Hoten, String nganhHoc) {
        this.Hoten = Hoten;
        this.nganhHoc = nganhHoc;
    }

    public abstract double getDiem();

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getHocLuc() {
        if (getDiem() < 4.0) {
            return "Yeu";
        } else if (getDiem() >= 4.0 && getDiem() < 6.0) {
            return "Trung binh";
        } else if (getDiem() >= 6.0 && getDiem() < 7.0) {
            return "Trung binh kha";
        } else if (getDiem() >= 7.0 && getDiem() < 8.0) {
            return "Kha";
        } else if (getDiem() >= 8.0 && getDiem() < 9.0) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    public void hienThiThongTin() {
        System.out.printf("SV: %20s - %s - %f - %s\n", Hoten, nganhHoc, getDiem(), getHocLuc());
    }
}
