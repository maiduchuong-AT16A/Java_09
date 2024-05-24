/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson07;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class solution {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int t = SC.nextInt();

        for (int T = 0; T < t; T++) {
            int n = SC.nextInt();
            double[] X = new double[2 * n];
            double[] Y = new double[2 * n];
            for (int j = 0; j < n; j++) {
                X[j] = SC.nextDouble();
                Y[j] = SC.nextDouble();
            }
            int k = SC.nextInt();
            double x1 = SC.nextDouble();
            double y1 = SC.nextDouble();

            int p = SC.nextInt();
            int m = SC.nextInt();

            double[] cX = new double[2 * m];
            double[] cY = new double[2 * m];
            for (int j = 0; j < m; j++) {
                cX[j] = SC.nextDouble();
                cY[j] = SC.nextDouble();
            }

            double[] cR = new double[m];
            for (int j = 0; j < m; j++) {
                cR[j] = SC.nextDouble();
            }

            int q = SC.nextInt();
            int i = SC.nextInt();
            int j = SC.nextInt();

            MyPoint[] ps = new MyPoint[n];
            for (int l = 0; l < n; l++) {
                ps[l] = new MyPoint(X[l], Y[l]);
            }

            MyCircle[] cs = new MyCircle[m];
            for (int l = 0; l < m; l++) {
                MyPoint tam = new MyPoint(cX[l], cY[l]);
                cs[l] = new MyCircle(cR[l], tam);
            }
            System.out.printf("\nCase #%d:\n", T + 1);
            System.out.printf("distance = %.3f\n", ps[k].getDistance(x1, y1));
            System.out.println(ps[p].toString());
            System.out.printf("Circle info: (%.2f, %.2f), radius = %.2f, circumference = %.3f, area = %.3f\n", cs[q].getTam().getX(), cs[q].getTam().getY(), cs[q].getR(),
                    cs[q].getCircumference(), cs[q].getArea());
            double distance1 = Math.sqrt(Math.pow(cX[i] - cX[j], 2) + Math.pow(cY[i] - cY[j], 2));
            double distance2 = Math.sqrt(Math.pow(cX[i] - cX[j], 2) - Math.pow(cY[i] - cY[j], 2));
            double sumR = cR[i] + cR[j];

            if (distance1 > sumR && distance2 >= sumR) {
                System.out.printf("Circle %d does not intersect Circle %d", i, j);
            } else if (distance1 <= sumR) {
                System.out.printf("Circle %d intersects with Circle %d", i, j);

            } else {
                System.out.printf("Circle %d is inside Circle %d", i, j);
            }

        }

    }
}
