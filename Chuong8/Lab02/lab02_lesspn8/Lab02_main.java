/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_lesspn8;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Lab02_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();

            SinhVienATTT[] at = new SinhVienATTT[M];
            SinhVienCNTT[] cn = new SinhVienCNTT[N];
            SinhVienDTVT[] dt = new SinhVienDTVT[P];

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            for (int i = 0; i < M; i++) {
                at[i] = new SinhVienATTT();
                sc.nextLine();
                at[i].setHoTen(sc.nextLine());
                at[i].setMaDoc(sc.nextDouble());
                at[i].setLapTrinhAnToanSo(sc.nextDouble());
                at[i].setDieuTraSo(sc.nextDouble());
                at[i].setNganhHoc("ATTT");
                //sc.nextLine();
            }

            for (int i = 0; i < N; i++) {
                cn[i] = new SinhVienCNTT();
                sc.nextLine();
                cn[i].setHoTen(sc.nextLine());
                cn[i].setWeb(sc.nextDouble());
                cn[i].setAndroid(sc.nextDouble());
                cn[i].setNhung(sc.nextDouble());
                cn[i].setNganhHoc("CNTT");
               // sc.nextLine();
            }

            for (int i = 0; i < P; i++) {
                dt[i] = new SinhVienDTVT();
                sc.nextLine();
                dt[i].setHoTen(sc.nextLine());
                dt[i].setTruyenDanSo(sc.nextDouble());
                dt[i].setThietKeModule(sc.nextDouble());
                dt[i].setViDieuKhien(sc.nextDouble());
                dt[i].setNganhHoc("DTVT");
                //sc.nextLine();
            }

            System.out.printf("Case #%d\n", t);
            System.out.println("" + at[x].hienThiThongTin());
            System.out.println("" + cn[y].hienThiThongTin());
            System.out.println("" + dt[z].hienThiThongTin());
        }
    }
}
