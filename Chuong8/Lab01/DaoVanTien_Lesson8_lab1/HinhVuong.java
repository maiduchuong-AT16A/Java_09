/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson8_lab1;

/**
 *
 * @author DELL
 */
public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong() {}

    public HinhVuong(double canh) {
        this.canh = canh;
        super.setcDai(canh);
        super.setcRong(canh);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    double getChuVi() {
        return super.getChuVi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    double getDienTich() {
        return super.getDienTich(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    String hienThiThongTin() {
        return String.format("HV(canh = %f): chu vi = %.03f, dien tich = %.03f",
                getCanh(), getChuVi(), getDienTich());
    }
    
}
