/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject44;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class Lab01_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t<= T; t++){
            System.out.printf("Case #%d:\n", t);
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            
            HinhChuNhat a[]= new HinhChuNhat[M];
            for(int i = 0; i<M; i++){
                double chieuDai = sc.nextDouble();
                double chieuRong = sc.nextDouble();
                a[i]= new HinhChuNhat(chieuDai, chieuRong);
            }
            HinhVuong b[]= new HinhVuong [N];
            for (int i = 0; i <N; i++){
                double canh = sc.nextDouble();
                b[i]= new HinhVuong(canh);
            }
            int c[]= new int [P];
            int d[]= new int [Q];
            for(int i =0; i<P; i++){
                c[i]=sc.nextInt();
                a[c[i]].hienThiThongTin();
            }
            for (int i = 0; i<Q; i++){
                d[i] = sc.nextInt();
                b[d[i]].hienThiThongTin();
            }
        }
    }
}
