/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newm;


/**
 *
 * @author quanm
 */
public class SinhVienATTT extends SinhVien {

    protected double diemMD, diemLTAT, diemDTS;

    public SinhVienATTT(String hoTen, String nganhHoc, double diemMD, double diemLTAT, double diemDTS) {
        super(hoTen, nganhHoc);
        this.diemMD = diemMD;
        this.diemLTAT = diemLTAT;
        this.diemDTS = diemDTS;
    }

    public void setDiemMD(double diemMD) {
        this.diemMD = diemMD;
    }

    public void setDiemLTAT(double diemLTAT) {
        this.diemLTAT = diemLTAT;
    }

    public void setDiemDTS(double diemDTS) {
        this.diemDTS = diemDTS;
    }
    
    public double getDiem(){
        return (this.diemMD * 2 + this.diemLTAT * 2 + this.diemDTS) / 5;
    }
   
}
