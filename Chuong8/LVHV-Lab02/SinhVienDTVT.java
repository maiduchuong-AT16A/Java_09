/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

/**
 *
 * @author van
 */
public class SinhVienDTVT extends SinhVien {

    double diemTDS;
    double diemTKModule;
    double diemVDK;

    public SinhVienDTVT(double diemTDS, double diemTKModule, double diemVDK, String Hoten, String nganhHoc) {
        super(Hoten, nganhHoc);
        this.diemTDS = diemTDS;
        this.diemTKModule = diemTKModule;
        this.diemVDK = diemVDK;
    }

    @Override
    public double getDiem() {
        return (diemVDK * 2 + diemTDS + diemTKModule) / 4;
    }
}
