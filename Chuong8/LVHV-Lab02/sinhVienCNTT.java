/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

/**
 *
 * @author van
 */
public class sinhVienCNTT extends SinhVien {

    double diemWeb;
    double diemAndroid;
    double diemNhung;

    public sinhVienCNTT(double diemWeb, double diemAndroid, double diemNhung, String Hoten, String nganhHoc) {
        super(Hoten, nganhHoc);
        this.diemWeb = diemWeb;
        this.diemAndroid = diemAndroid;
        this.diemNhung = diemNhung;
    }

    @Override
    public double getDiem() {
        return (diemWeb + diemAndroid * 2 + diemNhung * 2) / 5;
    }
}
