/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baithuchanh7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            MyPoint[] mp = new MyPoint[n];
            for (int i = 0; i < n; i++) {
                mp[i] = new MyPoint();
                mp[i].setXY(sc.nextDouble(), sc.nextDouble());

            }
            int k = sc.nextInt();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            int p = sc.nextInt();
            int m = sc.nextInt();
            MyCircle[] c = new MyCircle[m];
            for (int i = 0; i < m; i++) {
                c[i] = new MyCircle();
                c[i].setO(new MyPoint(sc.nextDouble(), sc.nextDouble()));
            }
            for (int i = 0; i < m; i++) {
                c[i].setR(sc.nextDouble());
            }

            int q = sc.nextInt();
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.printf("Case #%d:\n", t);
            System.out.printf("distance = %.3f\n", mp[k].getDistance(x1, y1));
            System.out.println(mp[p].toString());
            System.out.println(c[q].toString());
            double hieu = Math.abs(c[i].getR() - c[j].getR());
            double tong = c[i].getR() + c[j].getR();
            double d = c[i].getO().getDistance(c[j].getO());
            if (hieu < d && d < tong) {
                System.out.printf("Circle %d intersects with Circle %d\n", i, j);
            } else if (d < hieu && c[i].getR() < c[j].getR()) {
                System.out.printf("Circle %d is inside Circle %d\n", i, j);
            } else if (d < hieu || d > tong) {
                System.out.printf("Circle %d does not intersect Circle %d\n",i,j);
            }
            
        }

    }

}
