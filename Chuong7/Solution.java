/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.DaoVanTien_Lesson7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short T = sc.nextShort();
        for (short t = 1; t <= T; t++) 
        {
            // Nhap vao
            // dong 1: so luong diem MyPoint
            short n = sc.nextShort(); 
            MyPoint[] pnt = new MyPoint[n];
            // dong 2: nhap (x,y) cho tung diem
            for (int i = 0; i < n; i++) {
                pnt[i] = new MyPoint();
                pnt[i].setXY(sc.nextDouble(), sc.nextDouble());
            }
            // dong 3: khoang cach tu pnt[k] den (x1, y1)
            short k = sc.nextShort(); 
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            // dong 4: diem pnt[p] se duoc in thong tin ra
            short p = sc.nextShort();
            // dong 5: so luong duong tron
            short m = sc.nextShort(); 
            MyCircle[] C = new MyCircle[m];
            // dong 6: toa do tam cac duong tron
            for (int i=0; i<m; i++)
            {
                C[i] = new MyCircle();
                C[i].setI(new MyPoint(sc.nextDouble(), sc.nextDouble()));
            }
            // dong 7: ban kinh cac duong tron
            for (int i=0; i<m; i++)
            {
                C[i].setR(sc.nextDouble());
            }
            // dong 8: MyCircle C[q] se duoc in thong tin ra
            short q = sc.nextShort();
            // dong 9: MyCircle C[i] va C[j] co vi tri tuong doi ra sao
            short i = sc.nextShort(), j = sc.nextShort();
            
        //====================================
        
            // In ra
            System.out.printf("Case #%d:\n", t);
            System.out.printf("distance = %.03f\n", pnt[k].getDistance(x1, y1));
            System.out.println(pnt[p].toString());
            System.out.println(C[q].toString());
            double hieuR = Math.abs(C[i].getR()-C[j].getR());
            double tongR = C[i].getR()+C[j].getR();
            double d = C[i].getI().getDistance(C[j].getI());
            if (hieuR<d && d<tongR)
                System.out.printf("Circle %d intersects with Circle %d\n", i,j);
            else if (d<hieuR && C[i].getR()<C[j].getR())
                System.out.printf("Circle %d is inside Circle %d\n", i, j);
            else if (d<hieuR || d>tongR)
                System.out.printf("Circle %d does not intersect Circle %d\n", i, j);
        }
    }

    
}
