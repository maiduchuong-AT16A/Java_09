/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab01_Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int T = SC.nextInt();
        for (int i = 0; i < T; i++) {
            int M = SC.nextInt();
            int N = SC.nextInt();
            int P = SC.nextInt();
            int Q = SC.nextInt();
            HinhChuNhat[] hcn = new HinhChuNhat[M];
            for (int j = 0; j < M; j++) {
                double x = SC.nextDouble();
                double y = SC.nextDouble();
                hcn[j] = new HinhChuNhat(x, y);
            }
            hinhVuong[] hv = new hinhVuong[N];
            for (int j = 0; j < N; j++) {
                double x = SC.nextDouble();
                hv[j] = new hinhVuong(x);
            }
            int[] p = new int[P];
            for (int j = 0; j < P; j++) {
                p[j] = SC.nextInt();
            }
            int[] q = new int[Q];
            for (int j = 0; j < Q; j++) {
                q[j] = SC.nextInt();
            }

            System.out.println("Case #" + (i + 1) + ": ");
            for (int j = 0; j < P; j++) {
                System.out.println("" + hcn[p[j]].hienThiThongTin());
            }
            for (int j = 0; j < Q; j++) {
                System.out.println("" + hv[q[j]].hienThiThongTin());
            }

        }
    }
}
