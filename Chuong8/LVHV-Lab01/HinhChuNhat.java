/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author van
 */
public class HinhChuNhat {

    public double chieudai;
    public double chieurong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    public double getChuVi() {
        return 2 * (chieudai + chieurong);
    }

    public double getDienTich() {
        return chieudai * chieurong;
    }

    public void hienThiThongTin() {
        System.out.printf("HCN(%.6f, %.6f): chu vi = %.3f, dien tich = %.3f\n",getChieudai(),getChieurong(),getChuVi(),getDienTich());
    }
}
