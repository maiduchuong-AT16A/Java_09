/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class Lab01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            HinhChuNhat[] hcn = new HinhChuNhat[M];
            double cd, cr;
            for (int i = 0; i < M; i++) {
                cd = sc.nextDouble();
                cr = sc.nextDouble();
                hcn[i] = new HinhChuNhat(cd, cr);
            }
            HinhVuong[] hv = new HinhVuong[N];
            for (int i = 0; i < N; i++) {
                double c = sc.nextDouble();
                hv[i] = new HinhVuong(c);
            }
            System.out.println("Case#" + t+":");
            for (int i = 0; i < P; i++) {
                int p = sc.nextInt();
                hcn[p].hienThiThongTin();
            }
            for (int i = 0; i < Q; i++) {
                int q = sc.nextInt();
                hv[q].hienThiThongTin();
            }
        }
    }
}
