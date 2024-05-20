/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bai9_matrix;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MaTran {

    int soHang;
    int soCot;
    int[][] array;

    public MaTran(int soHang, int soCot, int[][] array) {
        this.soHang = soHang;
        this.soCot = soCot;
        this.array = new int[this.soHang][this.soCot];
    }

    public MaTran() {

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang:");
        soHang = sc.nextInt();
        System.out.println("Nhap so cot:");
        soCot = sc.nextInt();
        array = new int[soHang][soCot];
        System.out.println("Nhap cac phan tu cua matrix:");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                array[i][j] = sc.nextInt();

            }
        }
    }

    public void output() {
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void xoay_phai90() {        
        int[][] newarray = new int[soCot][soHang];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                newarray[j][i] = array[soHang -1 -i][j];
            }
        }
        array = newarray;
        int temp = soHang;
        soHang = soCot;
        soCot = temp;
    }

    public void xoay_180() {
        xoay_phai90();
        xoay_phai90();
    }

    public void xoay_trai90() {
        int[][] newarray = new int[soCot][soHang];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                newarray[soCot - 1 - j][i] = array[i][j];
            }
        }
        array = newarray;
        int temp = soHang;
        soHang = soCot;
        soCot = temp;
    }
}
