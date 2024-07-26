/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;

/**
 *
 * @author DELL
 */
public class ThiSinh {
    private String SBD, hoTen, gioiTinh, tinh;
    private double tongDiem;

    public ThiSinh() {}

    public ThiSinh(String SBD, String hoTen, String gioiTinh, String tinh, double tongDiem) {
        this.SBD = SBD;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tinh = tinh;
        this.tongDiem = tongDiem;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(double tongDiem) {
        this.tongDiem = tongDiem;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "SBD=" + SBD + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", tinh=" + tinh + ", tongDiem=" + tongDiem + '}';
    }
}
