/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newm;

/**
 *
 * @author quanm
 */
public class SinhVienCNTT extends SinhVien {
    protected double diemWeb, diemAndroid, diemNhung;
    public SinhVienCNTT(String hoTen, String nganhHoc, double diemWeb, double diemAndroid, double diemNhung){
        super(hoTen, nganhHoc);
        this.diemWeb = diemWeb; this.diemAndroid = diemAndroid; this.diemNhung = diemNhung;
    }
    public double getDiem(){
        return (this.diemWeb + this.diemAndroid * 2 + this.diemNhung * 2) / 5;
    }
}