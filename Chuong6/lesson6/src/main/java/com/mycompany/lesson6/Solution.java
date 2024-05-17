/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson6;

import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author ADMIN
 */
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1;
            n1 = sc.nextInt();
            double[] arr = new double[n1];
            for (int j = 0; j < n1; j++) {
                arr[j] = sc.nextDouble();
            }
            sc.nextLine();
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int k = sc.nextInt();
            System.out.printf("Case #%d:\n", i + 1);
            System.out.printf("Sum: %6.2f\n", Pratice.sum(arr));
            System.out.printf("Min: %6.1f\n", Pratice.getMin(arr));
            System.out.printf("Max: %6.1f\n", Pratice.getMax(arr));
            System.out.println("To upper: " + Pratice.toUpper(str1));
            System.out.println("To lower: " + Pratice.toLower(str2));
            System.out.printf("To upper first char: " + Pratice.toUpperFirstChar(str1));
            System.out.printf(" - ");
            System.out.println("" + Pratice.toUpperFirstChar(str2));
            System.out.printf("Fibonacci(%d): %6d", k, Pratice.getFibonacci(k));
            
        }
        
    }
    
}
