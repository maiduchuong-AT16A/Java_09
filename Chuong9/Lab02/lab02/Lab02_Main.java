/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab02;

import java.util.Scanner;

/**
 *
 * @author PC2
 */
public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t<=T; t++){
            System.out.printf("Case #%d:\n", t);
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            FullTimeEmployee a[] = new FullTimeEmployee [M];
            for (int i = 0; i<M; i++){
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                a[i] = new FullTimeEmployee(name, paymentPerHour);
            }
            PartTimeEmployee b[] = new PartTimeEmployee [N];
            for(int i = 0; i<N; i++){
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                int workingHours = sc.nextInt();
                b[i]= new PartTimeEmployee(name, paymentPerHour, workingHours);
            }
            int c[] = new int[P];
            int d[] = new int[Q];
            for(int i = 0; i<P; i++){
                c[i] = sc.nextInt();
                a[c[i]].showInfor();
            }
            for (int i = 0; i<Q; i++){
                d[i] = sc.nextInt();
                b[d[i]].showInfor();
            }
        }
    }
}
