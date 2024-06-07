/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab01;

import java.util.Scanner;


public class Lab01_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++){
            int M=sc.nextInt();
            int N=sc.nextInt();
            int P=sc.nextInt();
            int Q=sc.nextInt();
            Rectangle[] a = new Rectangle[M];
            for(int i=0;i<M;i++){
                a[i] = new Rectangle();
                a[i].setLength(sc.nextDouble());
                a[i].setWidth(sc.nextDouble());
                
            }
            Circle[] b = new Circle[N];
            for(int i=0;i<N;i++){
                b[i] = new Circle();
                b[i].setRadius(sc.nextDouble());
            }
            System.out.printf("Case #%d\n",t);
            for(int i=0;i<P;i++){
                int p=sc.nextInt();
                a[p].show();
            }
            for(int i=0;i<Q;i++){
                int q=sc.nextInt();
                b[q].show();
            }
        }
    }
}
