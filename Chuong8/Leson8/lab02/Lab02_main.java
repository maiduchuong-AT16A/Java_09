/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leson8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab02_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i =0 ;i<testcase;i++) {
            int soLuongATTT = sc.nextInt();
            int soLuongCNTT = sc.nextInt();
            int soLuongDTVT = sc.nextInt();
            SinhVienATTT[] attt = new SinhVienATTT[soLuongATTT];
            SinhVienCNTT[] cntt = new SinhVienCNTT[soLuongCNTT];
            SinhVienDTVT[] dtvt = new SinhVienDTVT[soLuongDTVT];
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int j =0;j<attt.length;j++) {
                sc.nextLine();
                attt[j] = new SinhVienATTT(sc.nextLine());                
                attt[j].setMaDoc(sc.nextDouble());
                attt[j].setLapTrinhAnToan(sc.nextDouble());
                attt[j].setDieuTraSo(sc.nextDouble());
            }
            for(int j =0;j<cntt.length;j++) {
                sc.nextLine();
                cntt[j] = new SinhVienCNTT(sc.nextLine());               
                cntt[j].setWeb(sc.nextDouble());
                cntt[j].setAndroid(sc.nextDouble());
                cntt[j].setNhung(sc.nextDouble());
            }
            for(int j =0;j<dtvt.length;j++) {
                sc.nextLine();
                dtvt[j] = new SinhVienDTVT(sc.nextLine());                
                dtvt[j].setDiemTDS(sc.nextDouble());
                dtvt[j].setDiemTKModule(sc.nextDouble());
                dtvt[j].setDiemVDK(sc.nextDouble());
            }
            System.out.printf("Case #%d: \n",i+1);
            System.out.println(attt[x].hienThiThongTin());
            System.out.println(cntt[y].hienThiThongTin());
            System.out.println(dtvt[z].hienThiThongTin());
            
         }
    }
}
