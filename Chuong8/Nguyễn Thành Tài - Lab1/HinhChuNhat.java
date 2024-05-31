/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javacore.basic.lesson08.hinhchunhat;

/**
 *
 * @author ACER
 */
public class HinhChuNhat {

   public double dai;
   public double rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
   
   public double getChuVi(){
       return 2*(dai+rong);
   }
   public double getDienTich(){
       return dai*rong;
   }

    
    public String HienThiThongTin() {
        return String.format("HCN(%.6f, %.6f): chu vi = %.3f, dien tich = %.3f",getDai(),getRong(),getChuVi(),getDienTich());
    }
   
   
}
