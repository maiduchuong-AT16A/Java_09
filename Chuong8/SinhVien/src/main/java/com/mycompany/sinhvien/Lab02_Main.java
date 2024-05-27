/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab02_Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int T = SC.nextInt();
        for (int t = 0; t < T; t++) {
            int M = SC.nextInt();
            int N = SC.nextInt();
            int P = SC.nextInt();

            SinhVienATTT[] attt = new SinhVienATTT[M];
            SinhVienCNTT[] cntt = new SinhVienCNTT[N];
            SinhVienDTVT[] dtvt = new SinhVienDTVT[P];

            int x = SC.nextInt();
            int y = SC.nextInt();
            int z = SC.nextInt();

            SC.nextLine(); 

            for (int i = 0; i < M; i++) {
                attt[i] = new SinhVienATTT();
                SC.nextLine(); 
                attt[i].setHoTen(SC.nextLine());
                attt[i].setMaDoc(SC.nextDouble());
                attt[i].setLapTrinhAnToanSo(SC.nextDouble());
                attt[i].setDieuTraSo(SC.nextDouble());
                attt[i].setNganhHoc("ATTT");
                SC.nextLine(); 
            }

            for (int i = 0; i < N; i++) {
                cntt[i] = new SinhVienCNTT();
                SC.nextLine(); 
                cntt[i].setHoTen(SC.nextLine());
                cntt[i].setWeb(SC.nextDouble());
                cntt[i].setAndroid(SC.nextDouble());
                cntt[i].setNhung(SC.nextDouble());
                cntt[i].setNganhHoc("CNTT");
                SC.nextLine(); 
            }

            for (int i = 0; i < P; i++) {
                dtvt[i] = new SinhVienDTVT();
                SC.nextLine(); 
                dtvt[i].setHoTen(SC.nextLine());
                dtvt[i].setTruyenDanSo(SC.nextDouble());
                dtvt[i].setThietKeModule(SC.nextDouble());
                dtvt[i].setViDieuKhien(SC.nextDouble());
                dtvt[i].setNganhHoc("DTVT");
                SC.nextLine(); 
            }

            System.out.println("Case #" + (t + 1));
            System.out.println("" + attt[x].hienThiThongTin());
            System.out.println("" + cntt[y].hienThiThongTin());
            System.out.println("" + dtvt[z].hienThiThongTin());
        }
    }
}
