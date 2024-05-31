/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject43;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t<= T; t++){
            System.out.printf("Case #%d:", t);
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            SinhVienATTT a[] = new SinhVienATTT[M];
            for(int i = 0; i<M;i++){
                sc.nextLine();
                String hoTen = sc.nextLine();
                //sc.nextLine();
                double diemMD = sc.nextDouble();
                double diemLTAT = sc.nextDouble();
                double diemDTS = sc.nextDouble();
                a[i] = new SinhVienATTT(hoTen, "ATTT",diemMD, diemLTAT, diemDTS);
            }
            SinhVienCNTT b[] = new SinhVienCNTT [N];
            for(int i = 0; i<N;i++){
                sc.nextLine();
                String hoTen = sc.nextLine();
                //sc.nextLine();
                double diemWeb = sc.nextDouble();
                double diemAndroid = sc.nextDouble();
                double diemNhung = sc.nextDouble();
                b[i] = new SinhVienCNTT(hoTen, "CNTT",diemWeb, diemAndroid, diemNhung);
            }
            SinhVienDTVT c[]= new SinhVienDTVT [P];
             for(int i = 0; i<P;i++){
                sc.nextLine();
                String hoTen = sc.nextLine();
                //sc.nextLine();
                double diemTDS = sc.nextDouble();
                double diemTKModule = sc.nextDouble();
                double diemVDK = sc.nextDouble();
                c[i] = new SinhVienDTVT(hoTen, "DTVT",diemTDS, diemTKModule, diemVDK);
            }
            a[x].hienThiThongTin();
            b[y].hienThiThongTin();
            c[z].hienThiThongTin();
        }
    }
}
