/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

/**
 *
 * @author van
 */
public class SinhVienATTT extends SinhVien {

    double MaDoc;
    double LTAT;
    double DieuTraSo;

    public SinhVienATTT(double MaDoc, double LTAT, double DieuTraSo, String Hoten, String nganhHoc) {
        super(Hoten, nganhHoc);
        this.MaDoc = MaDoc;
        this.LTAT = LTAT;
        this.DieuTraSo = DieuTraSo;
    }

    @Override
    public double getDiem() {
        return (MaDoc * 2 + LTAT * 2 + DieuTraSo) / 5;
    }
}
