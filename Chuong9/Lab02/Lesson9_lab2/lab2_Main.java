/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9_lab2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class lab2_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();

            FullTimeEmployee[] FT = new FullTimeEmployee[M];
            PartTimeEmployee[] PT = new PartTimeEmployee[N];
            int[] nvP = new int[P];
            int[] nvQ = new int[Q];

            for (int i = 0; i < M; i++) {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                FT[i] = new FullTimeEmployee(name, paymentPerHour);
            }

            for (int j = 0; j < N; j++) {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                int workingHour = sc.nextInt();
                PT[j] = new PartTimeEmployee(workingHour, name, paymentPerHour);

            }

            for (int m = 0; m < P; m++) {
                nvP[m] = sc.nextInt();
            }
            for (int n = 0; n < Q; n++) {
                nvQ[n] = sc.nextInt();
            }

            System.out.printf("Case #%d:\n", t);
            for (int m = 0; m < P; m++) {
                FT[nvP[m]].showInfor();
            }
            for (int n = 0; n < Q; n++) {
                PT[nvQ[n]].showInfor();
            }
        }
    }
}
