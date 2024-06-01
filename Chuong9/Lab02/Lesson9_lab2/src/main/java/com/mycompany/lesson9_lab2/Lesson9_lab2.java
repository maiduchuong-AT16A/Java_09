/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lesson9_lab2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson9_lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, T = sc.nextInt();
        for (t = 0; t < T; t++) {
            int M, N;
            M = sc.nextInt();
            N = sc.nextInt();
            FullTimeEmployee[] fte = new FullTimeEmployee[M];
            PartTimeEmployee[] pte = new PartTimeEmployee[N];
            int P, Q;
            P = sc.nextInt();
            Q = sc.nextInt();
            int[] nvF = new int[P];
            int[] nvP = new int[Q];
            for (int m = 0; m < M; m++) {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                fte[m] = new FullTimeEmployee(name, paymentPerHour);
            }
            for (int n = 0; n < N; n++) {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                int workingHour = sc.nextInt();
                pte[n] = new PartTimeEmployee(name, paymentPerHour, workingHour);

            }
            for (int p = 0; p < P; p++) {
                nvF[p] = sc.nextInt();
            }
            for (int q = 0; q < Q; q++) {
                nvP[q] = sc.nextInt();
            }
            System.out.printf("Case #%d:\n", t + 1);
            for (int p = 0; p < P; p++) {
                fte[nvF[p]].showInfor();
            }
            for (int q = 0; q < Q; q++) {
                pte[nvP[q]].showInfor();
            }
        }
    }
}
