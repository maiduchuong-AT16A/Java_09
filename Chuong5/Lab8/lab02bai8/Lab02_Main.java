/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02bai8;

import java.util.Scanner;


public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int M=sc.nextInt();
            int N=sc.nextInt();
            int P=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            SinhVienATTT[] a= new SinhVienATTT[M];
            for(int i=0;i<M;i++){
                a[i]=new SinhVienATTT();
                sc.nextLine();
                a[i].setHoten(sc.nextLine());
                a[i].setDieutraso(sc.nextDouble());
                a[i].setDieutraso(sc.nextDouble());
                a[i].setLaptrinhantoan(sc.nextDouble());
                a[i].setNganhhoc("ATTT");
                
                
            }
            SinhVienCNTT[] c = new SinhVienCNTT[N];
            for(int i=0;i<N;i++){
                c[i]=new SinhVienCNTT();
                sc.nextLine();
                c[i].setHoten(sc.nextLine());
                c[i].setWeb(sc.nextDouble());
                c[i].setAnroid(sc.nextDouble());
                c[i].setNhung(sc.nextDouble());
                c[i].setNganhhoc("CNTT");
                
            }
            SinhVienDTVT[] d = new SinhVienDTVT[P];
            for(int i=0;i<P;i++){
                d[i]=new SinhVienDTVT();
                sc.nextLine();
                d[i].setHoten(sc.nextLine());
                d[i].setThietkemodul(sc.nextDouble());
                d[i].setTruyendanso(sc.nextDouble());
                d[i].setVidieukhien(sc.nextDouble());
                d[i].setNganhhoc("DTVT");
            }
            System.out.printf("Case #%d\n",T);
            for(int i=0;i<M;i++){
                a[x].hienthithongtin();
                
            }
            for(int i=0;i<N;i++){
                c[y].hienthithongtin();
                
            }
            for(int i=0;i<P;i++){
                d[z].hienthithongtin();
                
            }
        }
    }
}
