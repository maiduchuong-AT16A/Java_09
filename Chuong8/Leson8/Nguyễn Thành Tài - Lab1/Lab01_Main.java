/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson08.hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab01_Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int T = SC.nextInt();
        for(int t = 0;t < T;t++){
            int M = SC.nextInt();
            int N = SC.nextInt();
            int p = SC.nextInt();
            int q = SC.nextInt();
            
              HinhChuNhat hcn[] = new HinhChuNhat[M];
            double d[] = new double[2 * M];
            double r[] = new double[2 * M];
            for(int  i = 0;i < M;i++){
                d[i] = SC.nextDouble();
                r[i] = SC.nextDouble();
                 hcn[i] = new HinhChuNhat(d[i],r[i]);
                
            }
            HinhVuong hv[] = new HinhVuong[N];
            double c[] = new double[2 * N];
              for(int  i = 0;i < N;i++){
                c[i] = SC.nextDouble();
               hv[i] = new HinhVuong(c[i]);
            }
            
           
              
              
              System.out.printf("\nCase #%d:\n",t + 1);
              for(int  i = 0;i < p;i++){
                  int P = SC.nextInt();
                  System.out.println(hcn[P].HienThiThongTin());
            }
                  for(int  i = 0;i < q;i++){
                  int Q = SC.nextInt();
                  System.out.println(hv[Q].HienThiThongTin());
           
        }
        
    }
}
}
