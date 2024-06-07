/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab02_Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("C://Users//Admin//Downloads//test_case_lab2.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            FullTimeEmployee[] a = new FullTimeEmployee[M];
            for (int i = 0; i < M; i++) {
                a[i] = new FullTimeEmployee();
                sc.nextLine();
                a[i].setName(sc.nextLine());
                a[i].setPaymentPerHour(sc.nextInt());
            }
            PartTimeEmployee[] b = new PartTimeEmployee[N];
            for (int i = 0; i < N; i++) {
                b[i] = new PartTimeEmployee();
                sc.nextLine();
                b[i].setName(sc.nextLine());

                b[i].setPaymentPerHour(sc.nextInt());
                b[i].setWorkingHours(sc.nextInt());
            }
            System.out.printf("Case #%d\n", t);
            for (int i = 0; i < P; i++) {
                int p = sc.nextInt();
                a[p].showInfo();
            }
            for (int i = 0; i < Q; i++) {
                int q = sc.nextInt();
                a[q].showInfo();
            }
        }

    }
}
