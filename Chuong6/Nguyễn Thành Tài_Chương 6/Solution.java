/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson06;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Solution {
     public static void main(String[] args) {
           Scanner SC = new Scanner(System.in);
         int T,t,n;
         
       T = SC.nextInt();
         
         for(t = 0;t < T;t++){
          n = SC.nextInt();
           double arr[] = new double[n];
          for(int i = 0;i < n;i++){
             arr[i] = SC.nextDouble();
          }
          SC.nextLine();
          String str1 = SC.nextLine();
          String str2 = SC.nextLine();
       
          int k = SC.nextInt();
          
          
             System.out.printf("Case #%d:\n",t+1);
             System.out.printf("Sum: %.02f\n",Practice.sum(arr));
             System.out.printf("Min: %.02f\n",Practice.getMin(arr));
             System.out.printf("Max : %.02f\n",Practice.getMax(arr));
             System.out.println("To upper: " + Practice.toUpper(str1));
             System.out.println("To lower: " + Practice.toLower(str2));
             System.out.println("To upper first char: " + Practice.toUpperFirstChar(str1) + " - "+Practice.toUpperFirstChar(str2));
             System.out.printf("Fibonacci(%d): %d",k,Practice.getFibonacci(k));
         
     }
    
}
}