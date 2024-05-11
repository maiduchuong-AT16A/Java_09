/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matran;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MaTran {

    int soHang;
    int soCot;
    int[][] mang2Chieu;

    public MaTran(int soHang, int soCot, int[][] mang2Chieu) {
        this.soHang = soHang;
        this.soCot = soCot;
        this.mang2Chieu = new int[this.soHang][this.soCot];
    }

    public MaTran() {

    }

    void input() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhap so hang");
        soHang = SC.nextInt();
        System.out.println("Nhap so cot");
        soCot = SC.nextInt();
        mang2Chieu = new int[soHang][soCot];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                mang2Chieu[i][j] = SC.nextInt();
            }
        }
    }

    void xuatMaTran() {
        System.out.println("Ma tran:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(mang2Chieu[i][j] + " ");
            }
            System.out.println();
        }
    }

    void xoayPhai90Do() {

        int[][] ketQua = new int[soCot][soHang];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                ketQua[j][soHang - 1 - i] = mang2Chieu[i][j];
            }
        }
        mang2Chieu = ketQua;
        int temp = soHang;
        soHang = soCot;
        soCot = temp;
    }

    void xoay180Do() {
        xoayPhai90Do();
        xoayPhai90Do();
    }

    void xoayTrai90Do() {

        int[][] ketQua = new int[soCot][soHang];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                ketQua[soCot - 1 - j][i] = mang2Chieu[i][j];
            }
        }
        mang2Chieu = ketQua;
        int temp = soHang;
        soHang = soCot;
        soCot = temp;
    }

}
