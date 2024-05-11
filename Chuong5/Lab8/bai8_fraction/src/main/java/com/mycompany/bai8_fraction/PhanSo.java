/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bai8_fraction;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class PhanSo {

    int tu;
    int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo() {

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        tu = sc.nextInt();
        System.out.println("Nhap mau so");
        mau = sc.nextInt();

    }

    public void output() {
        System.out.println("=======================");
        Hienthi();
        nghichDao();
        System.out.println("=======================");
    }

    public void rutGon() {
        int a = tu;
        int b = mau;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        tu = tu / a;
        mau = mau / a;
    }

    public void Hienthi() {
        rutGon();
        System.out.println("Phan so do la: " + tu + "/" + mau);
    }
    
    public void nghichDao(){
        rutGon();
        System.out.println("Nghich dao han so do la: " + mau + "/" + tu);
        
    }
}
