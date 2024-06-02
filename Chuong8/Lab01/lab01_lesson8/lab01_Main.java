/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01_lesson8;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class lab01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            HinhChuNhat[] Hcn = new HinhChuNhat[M];
            double cd, cr;
            for (int i = 0; i < M; i++) {
                cd = sc.nextDouble();
                cr = sc.nextDouble();
                Hcn[i] = new HinhChuNhat(cd, cr);
            }
            HinhVuong[] Hv = new HinhVuong[N];
            for (int j = 0; j < N; j++) {
                double a = sc.nextDouble();
                Hv[j] = new HinhVuong(a);
            }
            System.out.printf("Case#%d:\n",t);
            for (int i = 0; i < P; i++) {
                int p = sc.nextInt();
                Hcn[p].hienThiThongTin();
            }
            for (int j = 0; j < Q; j++) {
                int q = sc.nextInt();
                Hv[q].hienThiThongTin();
            }
        }
    }
}
