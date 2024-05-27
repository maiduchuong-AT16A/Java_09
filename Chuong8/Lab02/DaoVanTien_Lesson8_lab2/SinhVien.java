/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson8_lab2;

/**
 *
 * @author DELL
 */
public abstract class SinhVien {
    String hoTen, nganhHoc;

    public SinhVien(String hoTen, String nganhHoc) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }

    abstract double getDiem();

    public String getHoTen() {
        return hoTen;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }
    
    String getHocLuc()
    {
        if (getDiem()<4)
            return "Yeu";
        else if (getDiem()<6)
            return "Trung binh";
        else if (getDiem()<7)
            return "Trung binh kha";
        else if (getDiem()<8)
            return "Kha";
        else if (getDiem()<9)
            return "Gioi";
        else
            return "Xuat sac";
    }
    
    String hienThiThongTin()
    {
        return String.format("SV:%-20s - %s - %.02f - %s", hoTen, nganhHoc, getDiem(), getHocLuc());
    }
    
}
