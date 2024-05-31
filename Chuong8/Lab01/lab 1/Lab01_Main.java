/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bai_8;

/**
 *
 * @author quanm
 */
import java.util.Scanner;

public class Lab01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 1; j <= T; j++) {
            int m = sc.nextInt(), n = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
            HinhChuNhat[] hinhChuNhat = new HinhChuNhat[m];
            for (int i = 0; i < m; i++) {
                hinhChuNhat[i] = new HinhChuNhat(sc.nextDouble(), sc.nextDouble());
            }
            HinhVuong[] hinhVuong = new HinhVuong[n];
            for (int i = 0; i < n; i++) {
                hinhVuong[i] = new HinhVuong(sc.nextDouble());
            }
            System.out.printf("Case #%d:\n", j);
            for (int i = 0; i < p; i++) {
                int P = sc.nextInt();
                System.out.println(hinhChuNhat[P].hienThiThongTin());
            }
            for (int i = 0; i < q; i++) {
                int Q = sc.nextInt();
                System.out.println(hinhVuong[Q].hienThiThongTin());
            }
        }
    }
}
