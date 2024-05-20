/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore.basic.leson6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class solution {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            double[] x = new double[n];
            for(int j=0;j<n;j++){
                 x[j]= sc.nextDouble();
            }
            sc.nextLine();
            String str1, str2;
            str1 = sc.nextLine();
            str2 = sc.nextLine();
            int k = sc.nextInt();
            System.out.printf("Case #%d:", T);
            System.out.println("");
            System.out.printf("Sum: %.2f", Practice.sum(x));
            System.out.println("");
            System.out.printf("Min: %.1f\n", Practice.getMin(x));
            System.out.printf("Max: %.1f\n", Practice.getMax(x));
            System.out.println("To upper: " + Practice.toUpper(str1));
            System.out.println("To lower:" + Practice.toLower(str2));
            System.out.println("To upper first char:" + Practice.toUpperFirstChar(str1) + "-" + Practice.toUpperFirstChar(str2));
            System.out.printf("Fibonacci(%d): %d", k, Practice.getFibonacci(k));
        }

    }
}
