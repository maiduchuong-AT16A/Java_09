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
public class Lab01_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i = 0;i<testcase;i++) {
            int soLuongHCN = sc.nextInt();
            int soLuongHV = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int[] p = new int[P];
           
            int[] q = new int[Q];
            HinhChuNhat[] hcn = new HinhChuNhat[soLuongHCN];
            HinhVuong[] hv = new HinhVuong[soLuongHV];
            for(int j = 0;j<hcn.length;j++) {
                hcn[j] = new HinhChuNhat(sc.nextDouble(), sc.nextDouble());
            }
            sc.nextLine();
            for(int k = 0;k<hv.length;k++) {
                hv[k] = new HinhVuong(sc.nextDouble());
            }
            for (int j = 0; j < P; j++) {
                p[j] = sc.nextInt();
            }
            
            for (int j = 0; j < Q; j++) {
                q[j] = sc.nextInt();
            }
            System.out.printf("Case #%d:\n",i+1);
            for (int j = 0;j<P;j++) {
                System.out.printf("%s",hcn[p[j]].hienThiThongTin());
                System.out.println();
            }
            for (int j = 0;j<Q;j++) {
                System.out.printf("%s",hv[q[j]].hienThiThongTin());
                System.out.println();
            }
            
            
            
        }
    }
}
