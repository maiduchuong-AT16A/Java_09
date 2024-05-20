/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject36;

/**
 *
 * @author dell-vip
 */
public class Main {

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.input();
        System.out.println("chu vi hinh chu nhat = " + hcn.chuVi());
        System.out.println("dien tich hinh chu nhat " + hcn.dienTich());
    }
}
