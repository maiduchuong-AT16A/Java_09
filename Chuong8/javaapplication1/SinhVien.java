package javaapplication1;

public abstract class SinhVien {

    String Ho_ten;
    String Nganh_Hoc;

    public SinhVien(String Ho_ten, String Nganh_Hoc) {
        this.Ho_ten = Ho_ten;
        this.Nganh_Hoc = Nganh_Hoc;
    }

    public abstract double getDiem();

    public String getHo_ten() {
        return Ho_ten;
    }

    public void setHo_ten(String Ho_ten) {
        this.Ho_ten = Ho_ten;
    }

    public String getNganh_Hoc() {
        return Nganh_Hoc;
    }

    public void setNganh_Hoc(String Nganh_Hoc) {
        this.Nganh_Hoc = Nganh_Hoc;
    }

    public String getHocLuc() {
        if (getDiem() < 4.0) {
            return "Yeu";
        } else if (getDiem() >= 4.0 && getDiem() < 6.0) {
            return "TrungBinh";
        } else if (getDiem() >= 6.0 && getDiem() < 7.0) {
            return "TrungBinhKha";
        } else if (getDiem() >= 7.0 && getDiem() < 8.0) {
            return "Kha";
        } else if (getDiem() >= 8.0 && getDiem() < 9.0) {
            return "Gioi";
        } else {
            return "XuatSac";
        }
    }

    public void hienThiThongTin() {
        System.out.printf("SV: %-20s-%s-%.2f-%s\n", Ho_ten, Nganh_Hoc, getDiem(), getHocLuc());
    }
}
