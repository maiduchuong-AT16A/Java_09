/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.inputInfo();
        System.out.println("Chu vi hinh chu nhat: " + hcn.chuVi());
        System.out.println("Dien tich hinh chu nhat: " + hcn.dienTich());
    }
}
