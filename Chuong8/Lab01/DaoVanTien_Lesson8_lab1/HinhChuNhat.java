/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson8_lab1;

/**
 *
 * @author DELL
 */
public class HinhChuNhat {
    private double cDai, cRong;

    public HinhChuNhat() {}

    public HinhChuNhat(double cDai, double cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    public double getcDai() {
        return cDai;
    }

    public void setcDai(double cDai) {
        this.cDai = cDai;
    }

    public double getcRong() {
        return cRong;
    }

    public void setcRong(double cRong) {
        this.cRong = cRong;
    }
    
    double getChuVi()
    {
        return cDai*2+cRong*2;
    }
    
    double getDienTich()
    {
        return cDai*cRong;
    }
    
    String hienThiThongTin()
    {
        return String.format("HCN(%f, %f): chu vi = %.03f, dien tich = %.03f",
                            getcDai(), getcRong(), getChuVi(), getDienTich());
    }
}
