/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject39;

import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int t = 1; t <= testcase; t++) {
            System.out.printf("case#%d\n", t);
            
            int n;

            System.out.print("n = : ");
            n = sc.nextInt();
            System.out.println("cac phan tu cua mang mot chieu: ");
            double[] sumArr = new double[n];
            for (int i = 0; i < n; i++) {
                sumArr[i] = sc.nextDouble();
            }
            double Sum = Practice.sum(sumArr);
            System.out.printf("Sum = %.2f\n", Sum);

            double min = Practice.getMin(sumArr);
            System.out.printf("Min = %.1f\n", min);

            double max = Practice.getMax(sumArr);
            System.out.printf("Max = %.1f\n", max);
            
            
            sc.nextLine();
            System.out.print("Chuoi str1: ");
            String st1 = sc.nextLine();
            System.out.println("To upper: "+ Practice.toUpper(st1));
            System.out.print("Chuoi str2: ");
            String st2 = sc.nextLine();
            System.out.println("To lower: "+ Practice.toLower(st2));
            System.out.println("To upper first char: "+ Practice.toUpperFirstChar(st1) +" - " + Practice.toUpperFirstChar(st2));

            int position = sc.nextInt();
            long fibonacciNumber = Practice.getFibonacci(position);
            System.out.printf("Fibonacci(%d): %d ", position, fibonacciNumber);


        }
        System.out.println();
    }
}
