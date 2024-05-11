/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MaTran {

    private int soHang;
    private int soCot;
    private int[][] a;
    static Scanner sc = new Scanner(System.in);

    public MaTran(int soHang, int soCot) {
        this.soHang = soHang;
        this.soCot = soCot;
        a = new int[soHang][soCot];

    }

    public MaTran() {
    }

    public void inputInfo() {
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void output() {
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

    }

    public void xoayPhai90() {
        int[][] b = new int[soCot][soHang];
        for (int i = 0; i < soCot; i++) {
            int j = 0;
            int k = soHang - 1;

            while (j < soHang && k >= 0) {
                b[i][j] = a[k][i];
                j++;
                k--;
            }
        }
        System.out.println("Ma tran xoay phai 90 do la: ");
        System.out.println();
        for (int i = 0; i < soCot; i++) {
            for (int z = 0; z < soHang; z++) {
                System.out.printf("%d ", b[i][z]);
            }
            System.out.println();
        }
    }

    public void xoayTrai90() {
        int[][] b = new int[soCot][soHang];
        int k = soCot;
        for (int i = 0; i < soCot; i++) {
            int j = 0;
            while (j < soHang) {
                b[i][j] = a[j][k-1];
                j++;
            }
            k--;
        }
        System.out.println("Ma tran xoay trai 90 do la: ");
        System.out.println();
        for (int i = 0; i < soCot; i++) {
            for (int z = 0; z < soHang; z++) {
                System.out.printf("%d ", b[i][z]);
            }
            System.out.println();
        }

    }

    public void xoay180() {
        int[][] b = new int[soHang][soCot];
        int k = soHang;
        int j, z;
        for (int i = 0; i < soHang; i++) {
            j = 0;
            z = soCot - 1;
            while (j < soCot && z >= 0) {
                b[i][j] = a[k-1][z];
                j++;
                z--;
            }
            k--;

        }
        System.out.println("Ma tran xoay 180 do la: ");
        System.out.println();
        for (int i = 0; i < soHang; i++) {
            for (int x = 0; x < soCot; x++) {
                System.out.printf("%d ", b[i][x]);
            }
            System.out.println();
        }
        

    }

}
