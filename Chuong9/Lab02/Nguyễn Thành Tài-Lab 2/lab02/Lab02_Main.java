/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01.leson09.lab02;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab02_Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        int T = SC.nextInt();
        for(int t = 0;t < T;t++){
        int M = SC.nextInt();
        int N = SC.nextInt();
        int P = SC.nextInt();
        int Q = SC.nextInt();
        
        FullTimeEmployee ft[] = new FullTimeEmployee[M];
        PartTimeEmployee pt[] = new PartTimeEmployee[N];
        
        for(int i = 0;i< M;i++){
            SC.nextLine();
        ft[i] = new FullTimeEmployee(SC.nextLine(), SC.nextInt());
      
       }
         for(int i = 0;i< N;i++){
             SC.nextLine();
        pt[i] = new PartTimeEmployee(SC.nextLine(), SC.nextInt(),SC.nextInt());
      
       }
         System.out.printf("Case #%d:\n",t + 1);
         for(int i = 0;i < P;i++){
             
             int a = SC.nextInt();
            ft[a].showInfo();
             
             
         }
         for(int i = 0;i < Q;i++){
             int a = SC.nextInt();
             pt[a].showInfo();
            
         }
        }
    }
}
