/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int T = sc.nextInt();
        for(int i = 1; i <= T; i++)
        {
            int n = sc.nextInt(); 
            double[] a = new double[n];
            for(int j = 0; j < n; j++)
            {
                a[j] = sc.nextDouble();
            }
            sc.nextLine();
            String str1 = sc.nextLine(); String str2 = sc.nextLine(); int k = sc.nextInt();
            System.out.printf("Case #%d:\n", i);
            System.out.printf("Sum: %.1f\n",Project.getSum(a));
            System.out.printf("Min: %.1f\n",Project.getMin(a));
            System.out.printf("Max: %.1f\n", Project.getMax(a));
            System.out.printf("To upper: %s\n", Project.toUpper(str1));
            System.out.printf("To lower: %s\n", Project.toLower(str2));
            System.out.printf("To upper first char: %s - %s\n", Project.toUpperFirstChar(str1), Project.toUpperFirstChar(str2));
            System.out.printf("Fibonacci(%d): %d",k ,Project.getFibonacci(k));
        }
    }
}
