/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson8_lab2;

/**
 *
 * @author DELL
 */
public class SinhVienCNTT extends SinhVien{
    
    double diemWeb, diemAndroid, diemNhung;

    @Override
    double getDiem() {
        return (diemWeb+diemAndroid*2+diemNhung*2)/5;
    }

    public SinhVienCNTT(String hoTen, String nganhHoc, double diemWeb, double diemAndroid, double diemNhung) {
        super(hoTen, nganhHoc);
        this.diemWeb = diemWeb;
        this.diemAndroid = diemAndroid;
        this.diemNhung = diemNhung;
    }
    
}
