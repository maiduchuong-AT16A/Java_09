/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore.basic.lesson6;

import java.util.Scanner;

/**
 *
 * @author van
 */
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextDouble();
            }
            sc.nextLine();
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int k = sc.nextInt();
 
            System.out.println("Case #" +t+ ":");
            System.out.printf("Sum: %.2f\n" , Practice.getSum(a));
            System.out.println("Min: " +Practice.getMin(a));
            System.out.println("Max: "+Practice.getMax(a));
            System.out.println("To upper: "+Practice.toUpper(str1));
            System.out.println("To lower: "+Practice.toLower(str2));
            str1 = Practice.toLower(str1);
            str2 = Practice.toLower(str2);
            System.out.println("To upper first char: "+Practice.toUpperFirstChar(str1)+" - "+Practice.toUpperFirstChar(str2));
            System.out.printf("Fibonacci(%d): %d",k,Practice.getFibonacci(k));
            System.out.println("");
        }
    }
}
