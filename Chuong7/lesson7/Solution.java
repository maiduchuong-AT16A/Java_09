/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson7;

import java.util.Scanner;

/**
 *
 * @author van
 */
public class Solution {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            System.out.println("Case #" + t + ":");

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
            System.out.println("distance = " + String.format("%.3f", points[k].getDistance(x1, y1)));

            int p = scanner.nextInt();
            System.out.println(points[p]);

            int m = scanner.nextInt();
            MyCircle[] circles = new MyCircle[m];

            for (int i = 0; i < m; i++) {
                double centerX = scanner.nextDouble();
                double centerY = scanner.nextDouble();
                circles[i] = new MyCircle(centerX, centerY, 0);
            }

            for (int i = 0; i < m; i++) {
                double radius = scanner.nextDouble();
                circles[i].setR(radius);
            }

            int q = scanner.nextInt();
            System.out.println(circles[q]);

            int i = scanner.nextInt();
            int j = scanner.nextInt();
            
            // Kiểm tra vị trí tương đối của hai hình tròn
            double distanceBetweenCenters = Math.sqrt(Math.pow(circles[i].getCenterX() - circles[j].getCenterX(), 2) + Math.pow(circles[i].getCenterY() - circles[j].getCenterY(), 2));
            double sumOfRadii = circles[i].getR() + circles[j].getR();

            if (distanceBetweenCenters > sumOfRadii||distanceBetweenCenters<Math.abs(circles[i].getR() - circles[j].getR())) {
                System.out.println("Circle "+i+" does not intersect with Circle "+j);
            } else if (distanceBetweenCenters < Math.abs(circles[j].getR() - circles[i].getR())) {
                System.out.println("Circle "+i+" is inside Circle "+j);
            } else {
                System.out.println("Circle "+i+" intersects with Circle "+j);
            }
        }

        scanner.close();
    }
}
