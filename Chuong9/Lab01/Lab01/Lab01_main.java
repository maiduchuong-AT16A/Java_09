/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab01_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i =0;i<testcase;i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            Rectangle[] hcn = new Rectangle[m];            
            Circle[] ht = new Circle[n];
            int[] a = new int[p];
            int[] b = new int[q];
            for(int j = 0;j<hcn.length;j++) {
                hcn[j] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
            sc.nextLine();
            for(int j = 0;j<ht.length;j++) {
                ht[j] = new Circle(sc.nextDouble());
            }
            sc.nextLine();
            for(int j =0;j<a.length;j++) {
                a[j] = sc.nextInt();
                
            }
            sc.nextLine();
            for(int j = 0;j<b.length;j++) {
                b[j] = sc.nextInt();
            }
            System.out.printf("Case #%d: \n",i+1);
            for(int j =0;j<a.length;j++) {
                hcn[a[j]].show();
                
            }
            for(int j = 0;j<b.length;j++) {
                ht[b[j]].show();
                System.out.print("\n");
            }
            
            
                
        }
    }
}
