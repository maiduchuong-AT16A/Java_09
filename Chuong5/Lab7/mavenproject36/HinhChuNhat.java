/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject36;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class HinhChuNhat {

    double chieu_dai;
    double chieu_rong;

    public HinhChuNhat(double chieu_dai, double chieu_rong) {
        this.chieu_dai = chieu_dai;
        this.chieu_rong = chieu_rong;
    }

    public HinhChuNhat() {
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("chieu dai = ");
        chieu_dai = sc.nextDouble();
        System.out.print("chieu rong = ");
        chieu_rong = sc.nextDouble();
    }

    double chuVi() {
        return (2 * (chieu_dai + chieu_rong));
    }

    double dienTich() {
        return (chieu_dai * chieu_rong);
    }
}
