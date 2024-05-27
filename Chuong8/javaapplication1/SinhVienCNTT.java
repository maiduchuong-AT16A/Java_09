
package javaapplication1;


public class SinhVienCNTT extends SinhVien{
    double web;
    double android;
    double Nhung;

    public SinhVienCNTT(String Ho_ten, String Nganh_Hoc, double web, double android, double Nhung) {
        super(Ho_ten, Nganh_Hoc);
        this.web = web;
        this.android = android;
        this.Nhung = Nhung;
    }

    public double getWeb() {
        return web;
    }

    public void setWeb(double web) {
        this.web = web;
    }

    public double getAndroid() {
        return android;
    }

    public void setAndroid(double android) {
        this.android = android;
    }

    public double getNhung() {
        return Nhung;
    }

    public void setNhung(double Nhung) {
        this.Nhung = Nhung;
    }
    
    @Override
    public double getDiem() {
        return (web+android*2+Nhung*2)/5;
    }
            
}
