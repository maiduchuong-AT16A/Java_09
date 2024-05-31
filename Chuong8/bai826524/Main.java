/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai826524;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            HinhChuNhat[] a = new HinhChuNhat[m];
            for (int i = 0; i < m; i++) {
                a[i] = new HinhChuNhat();
                a[i].setChieudai(sc.nextDouble());
                a[i].setChieurong(sc.nextDouble());
                
            }
            HinhVuong[] b = new HinhVuong[n];
            for (int i = 0; i < n; i++) {
                b[i] = new HinhVuong();
                b[i].setCanh(sc.nextDouble());
            }
            
            
            System.out.printf("Case #%d:\n",t);
            for(int i=0;i<p;i++){
                int P = sc.nextInt();
                a[P].hienthithongtin();
            }
            for(int i=0;i<q;i++){
                int Q = sc.nextInt();
                b[Q].hienthithongtin();
            } 
           
        }
    }
}
