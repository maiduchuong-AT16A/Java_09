/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson7.Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solution {

    private MyPoint[] a;
    private MyCircle[] b;
    Scanner sc = new Scanner(System.in);

    public Solution() {
    }

    public void sizeOfMyPoint(int n) {
        a = new MyPoint[n];
    }

    public void sizeofMyCircle(int m) {
        b = new MyCircle[m];
    }

    public void inputOfMyPoint(Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new MyPoint();
            a[i].setX(sc.nextDouble());
            a[i].setY(sc.nextDouble());

        }
    }

    public String tinhKC(int k, double x1, double y1) {
        MyPoint mp = new MyPoint();
        mp.setX(x1);
        mp.setY(y1);
        return String.format("%.3f", a[k].getDistance(mp.getX(), mp.getY()));
    }

    public String thongTinMyPoint(int p) {
        return a[p].toString();
    }

    public void inputOfMyCircle(Scanner sc) {
        for (int i = 0; i < b.length; i++) {
            MyPoint mp = new MyPoint(sc.nextDouble(), sc.nextDouble());
            b[i] = new MyCircle();
            b[i].setTam(mp);
        }
        for (int i = 0; i < b.length; i++) {

            b[i].setBanKinh(sc.nextDouble());
        }
    }

    public String thongTinMyCircle(int q) {
        return b[q].toString();
    }

    public String viTriTuongDoi(int i, int j) {
        double kcTam = b[i].getTam().getDistance(b[j].getTam().getX(), b[j].getTam().getY());
        double hieuBanKinh = Math.abs(b[i].getBanKinh() - b[j].getBanKinh());
        double tongBanKinh = b[i].getBanKinh() + b[j].getBanKinh();
        if (kcTam <= tongBanKinh && kcTam >= hieuBanKinh) {
            return "Circle " + i + " intersects with Circle " + j;
        } else if (kcTam <= hieuBanKinh && (b[j].getBanKinh() > b[i].getBanKinh())) {
             
                return "Circle " + i + " is inside Circle " + j;
        }else  {
            return "Circle " + i + " does not intersect Circle " + j;
        
        
        
    }

}
}
