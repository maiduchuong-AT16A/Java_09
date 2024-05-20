/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject34;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class MaTran {

    int row;
    int column;
    int[][] a;
    Scanner sc = new Scanner(System.in);

    public MaTran(int row, int column) {
        this.row = row;
        this.column = column;
        this.a = new int[row][column];
    }

    public MaTran() {

    }

    void inputInfo() {

        System.out.println("Nhap du lieu: ");
        System.out.print("Nhap so hang cua ma tran: ");
        row = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        column = sc.nextInt();
        a = new int[row][column];
    }

    void nhap() {
        System.out.println("Nhap ma tran: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhap phan tu [" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void showInfo() {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
                System.out.printf("%d     ", a[i][j]);
            }
            System.out.println();
        }
    }

    void xoayPhai90() {
        System.out.println("ma tran xoay phai 90 do");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%d     ", a[row - 1 - j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void xoay180() {
        System.out.println("ma tran xoay 180 do");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%d     ", a[row - 1 - i][column - 1 - j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    void xoayTrai90() {
        System.out.println("ma tran xoay trai 90 do");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%d     ", a[j][column - 1 - i]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
