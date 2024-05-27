/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson8_lab2;

/**
 *
 * @author DELL
 */
public class SinhVienDTVT extends SinhVien{
    
    double diemTDS, diemTKModule, diemVDK;

    @Override
    double getDiem() {
        return (diemVDK*2+diemTDS+diemTKModule)/4;
    }

    public SinhVienDTVT(String hoTen, String nganhHoc, double diemTDS, double diemTKModule, double diemVDK) {
        super(hoTen, nganhHoc);
        this.diemTDS = diemTDS;
        this.diemTKModule = diemTKModule;
        this.diemVDK = diemVDK;
    }
    
    
    
}
