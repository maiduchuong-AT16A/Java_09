package com.mycompany.bai_7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author quanm
 */
import java.util.Scanner;
import java.lang.Math;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int T = sc.nextInt();
       for(int t = 1; t <= T; t++)
       {
           int n = sc.nextInt();
           MyPoint[] myPoint = new MyPoint[n];
           for(int j = 0; j < n; j++)
           {
               myPoint[j] = new MyPoint(sc.nextDouble(), sc.nextDouble());
           }
           int k = sc.nextInt(); double x1 = sc.nextDouble(), y1 = sc.nextDouble();
           int p = sc.nextInt(); int m = sc.nextInt();
           MyCircle[] myCircle = new MyCircle[m];
           for(int j = 0; j < m; j++)
           {  
               MyPoint tam = new MyPoint(sc.nextDouble(), sc.nextDouble());
               myCircle[j] = new MyCircle();
               myCircle[j].setTam(tam);
           } 
           for(int j = 0; j < m; j++)
           {
           myCircle[j].setBanKinh(sc.nextDouble());
           }
           int q = sc.nextInt(); int i = sc.nextInt(); int j = sc.nextInt();
           System.out.printf("Case #%d:\n", t);
           System.out.printf("distance = %.3f\n", myPoint[k].getDistance(x1, y1));
           System.out.println(myPoint[p]);
           System.out.println(myCircle[q]);
           double khoangCach = myCircle[i].getTam().getDistance(myCircle[j].getTam().getX(),myCircle[j].getTam().getY()) ;
           double hieuBanKinh = myCircle[i].getBanKinh() - myCircle[j].getBanKinh();
           double tongBanKinh = myCircle[i].getBanKinh() + myCircle[j].getBanKinh();
           if(khoangCach > tongBanKinh)
           {
               System.out.printf("Circle %d does not intersect Circle %d\n", i, j);
           }
           else if(khoangCach == tongBanKinh)
           {
               System.out.printf("Circle %d intersects with Circle %d\n", i, j);
           }
           else 
           {
               if(khoangCach < hieuBanKinh && hieuBanKinh >= 0)
               {
                   System.out.printf("Circle %d is inside Circle %d\n", i, j);
               }
               else if(khoangCach < hieuBanKinh && hieuBanKinh < 0)
               {
                   System.out.printf("Circle %d is inside Circle %d\n", j, i);
               }
               else
               {
                   System.out.printf("Circle %d intersects with Circle %d\n", i, j);
               }
           }           
       }
    }
}
