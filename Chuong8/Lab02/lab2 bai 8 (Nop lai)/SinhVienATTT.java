
package javaapplication1;


public class SinhVienATTT extends SinhVien{
      double MaDoc;
      double LapTrinhAnToan;
      double DieuTraSo;

    public SinhVienATTT(String Ho_ten,String Nganh_Hoc, double MaDoc, double LapTrinhAnToan, double DieuTraSo) {
        super(Ho_ten, Nganh_Hoc);
        this.MaDoc = MaDoc;
        this.LapTrinhAnToan = LapTrinhAnToan;
        this.DieuTraSo = DieuTraSo;
    }

    public double getMaDoc() {
        return MaDoc;
    }

    public void setMaDoc(double MaDoc) {
        this.MaDoc = MaDoc;
    }

    public double getLapTrinhAnToan() {
        return LapTrinhAnToan;
    }

    public void setLapTrinhAnToan(double LapTrinhAnToan) {
        this.LapTrinhAnToan = LapTrinhAnToan;
    }

    public double getDieuTraSo() {
        return DieuTraSo;
    }

    public void setDieuTraSo(double DieuTraSo) {
        this.DieuTraSo = DieuTraSo;
    }
    
   
    public double getDiem() {
       return (MaDoc*2+LapTrinhAnToan*2+DieuTraSo*2)/5;
    }
}
