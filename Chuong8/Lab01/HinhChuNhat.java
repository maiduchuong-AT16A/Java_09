
package javaapplication1;


public class HinhChuNhat {
    public double ChieuDai;
    public double ChieuRong;

    public HinhChuNhat(double ChieuDai, double ChieuRong) {
        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }

    public HinhChuNhat() {
    }

    public double getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(double ChieuDai) {
        this.ChieuDai = ChieuDai;
    }

    public double getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(double ChieuRong) {
        this.ChieuRong = ChieuRong;
    }
    public double getChuVi()
    {
        return (ChieuDai+ChieuRong)*2;
    }
    public double getDienTich()
    {
        return ChieuDai*ChieuRong;
    }
    public void hienThiThongTin()
    {
        System.out.printf("HCN(%f, %f): chu vi = %.3f, dien tich = %.3f\n", getChieuDai(),getChieuRong(),getChuVi(),getDienTich()); 
    }
}
