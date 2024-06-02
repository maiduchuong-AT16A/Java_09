/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject21;

import java.util.Scanner;

/**
 *
 * @author PC2
 */
public class Lab01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            System.out.printf("Case #%d:\n", t);
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            Rectangle a[] = new Rectangle[M];
            for (int i = 0; i < M; i++) {
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                a[i] = new Rectangle(length, width);
            }
            Circle b[] = new Circle[N];
            for (int i = 0; i < N; i++) {
                double radius = sc.nextDouble();
                b[i] = new Circle(radius);
            }
            int c[] = new int[P];
            int d[] = new int[Q];
            for (int i = 0; i < P; i++) {
                c[i] = sc.nextInt();
                a[c[i]].show();
            }
            for (int i = 0; i < Q; i++) {
                d[i] = sc.nextInt();
                b[d[i]].show();
            }
        }
    }
}
