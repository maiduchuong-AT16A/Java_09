/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject41;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t <= T; t++){
            System.out.printf("Case #%d:\n", t);
            int n = sc.nextInt();
            MyPoint a[] = new MyPoint[n];
            for(int j = 0; j<n; j++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                a[j] = new MyPoint(x, y);
            }
            int k = sc.nextInt();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            System.out.printf("distance = %.3f\n", a[k].getDistance(x1, y1));
            int p = sc.nextInt();
            System.out.println(""+a[p].toString());
            int m = sc.nextInt();
            MyCircle b[] = new MyCircle[m];
            for(int j = 0; j<m; j++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                b[j]= new MyCircle(x, y, j);
            }
            for(int j = 0; j<m; j++){
                double r = sc.nextDouble();
                b[j].setR(r);
            }
            int q = sc.nextInt();
            System.out.println(""+ b[q].toString());
            int i = sc.nextInt();
            int j = sc.nextInt();
            double r1 = b[i].getR();
            double r2 = b[j].getR();
            //System.out.println(""+ r1);
            //System.out.println(""+ r2);
            
            double kc = b[i].getTam().getDistance(b[j].getTam().getX(), b[j].getTam().getY());
            //System.out.println(""+kc);
            if(kc > (r1 + r2) || kc < (r1 - r2)){
                System.out.printf("Circle %d does not intersect Circle %d\n", i, j);
            }else if(kc < (r2 - r1)){
                System.out.printf("Circle %d is inside Circle %d\n", i, j);
            }else{
                System.out.printf("Circle %d intersects with Circle %d\n", i, j);
            }
        }
    }
}
