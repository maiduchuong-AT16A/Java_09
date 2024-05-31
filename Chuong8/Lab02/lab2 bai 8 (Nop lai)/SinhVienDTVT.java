
package javaapplication1;


public class SinhVienDTVT extends SinhVien{
    double Truyen_dan_so;
    double Thiet_ke_modul;
    double Vi_dieu_khien;

    public SinhVienDTVT(String Ho_ten, String Nganh_Hoc, double Truyen_dan_so, double Thiet_ke_modul, double Vi_dieu_khien) {
        super(Ho_ten, Nganh_Hoc);
        this.Truyen_dan_so = Truyen_dan_so;
        this.Thiet_ke_modul = Thiet_ke_modul;
        this.Vi_dieu_khien = Vi_dieu_khien;
    }

    public double getTruyen_dan_so() {
        return Truyen_dan_so;
    }

    public void setTruyen_dan_so(double Truyen_dan_so) {
        this.Truyen_dan_so = Truyen_dan_so;
    }

    public double getThiet_ke_modul() {
        return Thiet_ke_modul;
    }

    public void setThiet_ke_modul(double Thiet_ke_modul) {
        this.Thiet_ke_modul = Thiet_ke_modul;
    }

    public double getVi_dieu_khien() {
        return Vi_dieu_khien;
    }

    public void setVi_dieu_khien(double Vi_dieu_khien) {
        this.Vi_dieu_khien = Vi_dieu_khien;
    }
    
    @Override
    public double getDiem() {
        return (Vi_dieu_khien*2+Truyen_dan_so+Thiet_ke_modul)/4;
    }


    
}
