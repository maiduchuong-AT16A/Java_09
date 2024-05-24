/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson07;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            MyPoint[] points = new MyPoint[n];
            for (int i = 0; i < n; i++) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points[i] = new MyPoint(x, y);
            }
            int k = scanner.nextInt();
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            int p = scanner.nextInt();

            int m = scanner.nextInt();
            MyCircle[] circles = new MyCircle[m];
            for (int i = 0; i < m; i++) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                circles[i] = new MyCircle(x, y, 0);
            }
            for (int i = 0; i < m; i++) {
                double r = scanner.nextDouble();
                circles[i].setR(r);
            }

            int q = scanner.nextInt();

            int i = scanner.nextInt();
            int j = scanner.nextInt();

            System.out.printf("Case #%d:\n", t);
            System.out.printf("distance = %.3f\n", points[k].getDisstance(x1, y1));
            System.out.println("" + points[p].toString());
            System.out.println("" + circles[q].toString());
            double khoangCachTuTamIDenTamJ = circles[i].getI().getDisstance(circles[j].getI().getX(), circles[j].getI().getY());
            double tong2BanKinh = circles[i].getR() + circles[j].getR();
            double RitruRj = circles[i].getR() - circles[j].getR();
            double RjtruRi = circles[j].getR() - circles[i].getR();
            if (khoangCachTuTamIDenTamJ > tong2BanKinh || khoangCachTuTamIDenTamJ < RitruRj) {
                System.out.println("Circle " + i + " does not intersect Circle " + j);
            } else if (khoangCachTuTamIDenTamJ < RjtruRi) {
                System.out.println("Circle " + i + " is inside Circle " + j);
            } else {
                System.out.println("Circle " + i + " intersects with Circle " + j);
            }

        }
    }
}
