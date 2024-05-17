/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject35;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class PhanSo {

    int tuSo;
    int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
    }

    void nhap_phan_so() {
        Scanner sc = new Scanner(System.in);
        System.out.print("tu so = ");
        tuSo = sc.nextInt();
        System.out.print("mau so = ");
        mauSo = sc.nextInt();
        //System.out.printf("phan so = %d/%d\n", tuSo, mauSo);
    }

    int finducln(int tuSo, int mauSo) {
        while (mauSo != 0) {
            int temp = mauSo;
            mauSo = tuSo % mauSo;
            tuSo = temp;
        }
        return tuSo;
    }

    void rut_gon_phan_so() {

        int ucln = finducln(tuSo, mauSo);
        System.out.printf("phan so rut gon = %d/%d\n", tuSo / ucln, mauSo / ucln);

    }

    void hien_thi_phan_so() {
        System.out.printf("phan so = %d/%d\n", tuSo, mauSo);
    }

    void nghich_dao_phan_so() {
        System.out.printf("phan so nghich dao = %d/%d", mauSo, tuSo);
    }
}
