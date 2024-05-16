/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson06;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Solution {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        // NHAP TESTCASR
        int t = SC.nextInt();
        SC.nextLine();
        for (int i = 0; i < t; i++) {

            //NHAP CAC GIA TRI
            int n = SC.nextInt();
            double[] x = new double[n];

            for (int j = 0; j < n; j++) {
                x[j] = SC.nextDouble();
            }
            SC.nextLine();
            String str1 = SC.nextLine();
            String str2 = SC.nextLine();
            int k = SC.nextInt();
            SC.nextLine();

            //GOI CAC PHUONG THUC
            double sum = Practice.sum(x);
            double min = Practice.getMin(x);
            double max = Practice.getMax(x);
            String toUpperStr1 = Practice.toUpper(str1);
            String toLowerStr2 = Practice.toLower(str2);
            String toUpperFirstCharStr1 = Practice.toUpperFirstChar(Practice.toLower(str1));
            String toUpperFirstCharStr2 = Practice.toUpperFirstChar(Practice.toLower(str2));
            long fibonacciK = Practice.getFibonacci(k);

            //IN RA KET QUA
            System.out.printf("Case #%d:\n", i + 1);
            System.out.printf("Sum: %.2f\n", sum);
            System.out.printf("Min: %.1f%n", min);
            System.out.printf("Max: %.1f%n", max);
            System.out.println("To upper: " + toUpperStr1);
            System.out.println("To lower: " + toLowerStr2);
            System.out.println("To upper first char: " + toUpperFirstCharStr1 + " - " + toUpperFirstCharStr2);
            System.out.println("Fibonacci(" + k + "): " + fibonacciK);

        }

    }

}
