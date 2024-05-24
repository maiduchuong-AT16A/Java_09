/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();

            MyPoint[] arrpoints = new MyPoint[n];
            //Dong 2
            for (int f = 0; f < n; f++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arrpoints[f] = new MyPoint(x, y);
            }
            //Dong 3
            int k = sc.nextInt();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            //Dong 4
            int p = sc.nextInt();
            //Dong 5
            int m = sc.nextInt();
            //Dong 6
            MyCircle[] arrcircles = new MyCircle[m];
            for (int f = 0; f < m; f++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arrcircles[f] = new MyCircle(0, x, y);
            }
            //Dong 7
            for (int f = 0; f < m; f++) {
                double r = sc.nextDouble();
                arrcircles[f].setR(r);
            }
            //Dong 8
            int q = sc.nextInt();
            //Dong 9
            int i1 = sc.nextInt();
            int j = sc.nextInt();

            //Output
            System.out.printf("Case #%d:\n", i);
            System.out.printf("distance = %.3f\n", arrpoints[k].getDistance(x1, y1));
            System.out.println("" + arrpoints[p].toString());
            System.out.println("" + arrcircles[q].toString());
            double tong2R = arrcircles[i1].getR() + arrcircles[j].getR();
            double hieu2R = arrcircles[i1].getR() - arrcircles[j].getR();
            double hieu2R2 = arrcircles[j].getR() - arrcircles[i1].getR();
            double kCach = arrcircles[i1].getTam().getDistance(arrcircles[j].getTam().getX(), arrcircles[j].getTam().getY());
            if ((kCach > tong2R) || (kCach > hieu2R)) {
                System.out.println("Cicrcle " + i1 + " does not intersect Circle " + j);
            } else if (kCach < hieu2R2) {
                System.out.println("Cicrcle " + i1 + " is inside Circle " + j);
            } else {
                System.out.println("Circle " + i1 + " intersects with Circle " + j);
            }
        }
    }

}

/*
1
2
66.17 49.92 44.51 66.77 
0 4 0
0 
3
28.14 35.95 44.89 54.03 67.70 56.26
61.99 45.04 79.10
1 
1 0
*/