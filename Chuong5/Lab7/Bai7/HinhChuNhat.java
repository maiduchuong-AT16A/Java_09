/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    static Scanner sc = new Scanner(System.in);
            
    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public void inputInfo() {
        System.out.println("Nhap chieu dai: ");
        this.chieuDai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        this.chieuRong = sc.nextDouble();
    }
    public double chuVi() {
        double chuvi = (chieuDai+chieuRong)*2;
        return chuvi;
    }
    public double dienTich() {
        double dientich = chieuDai*chieuRong;
        return dientich;
    }
            

    
}
