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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        Solution[] sl = new Solution[testcase];
        for (int i = 0; i < sl.length; i++) {
            sl[i] = new Solution();
            sl[i].sizeOfMyPoint(sc.nextInt());
            sl[i].inputOfMyPoint(sc);
            int k = sc.nextInt();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            int thongTinMyPoint = sc.nextInt();

            sl[i].sizeofMyCircle(sc.nextInt());
            sl[i].inputOfMyCircle(sc);
            int thongTinMyCircle = sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            System.out.printf("Case #%d: \n",i+1);
            System.out.println("distance = " + sl[i].tinhKC(k, x1, y1));
            System.out.println(sl[i].thongTinMyPoint(thongTinMyPoint));
            System.out.println(sl[i].thongTinMyCircle(thongTinMyCircle));
            System.out.println(sl[i].viTriTuongDoi(k1, k2));

        }
    }
}
