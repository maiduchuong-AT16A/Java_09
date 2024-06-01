/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

import com.lesson7.Bai1.TestMyPoint;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i = 0;i<testcase;i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            FullTimeEmployee[] m = new  FullTimeEmployee[M];
            PartTimeEmployee[] n = new PartTimeEmployee[N];
            int[] a = new int[P];
            int[] b = new int[Q];
            sc.nextLine();
            for(int j=0;j<m.length;j++) {
                m[j] = new FullTimeEmployee();
                m[j].setName(sc.nextLine());
                m[j].setPaymentPerHour(sc.nextInt());
                sc.nextLine();
            }
            
            for(int j = 0;j<n.length;j++) {
                n[j] = new PartTimeEmployee();
                n[j].setName(sc.nextLine());
                n[j].setPaymentPerHour(sc.nextInt());
                
                n[j].setWorkingHours(sc.nextInt());
                sc.nextLine();
            }
            
            for(int j = 0;j<a.length;j++) {
                a[j] = sc.nextInt();
            }
            sc.nextLine();
            for(int j =0;j<b.length;j++) {
                b[j] = sc.nextInt();
                
            }
            System.out.printf("Case #%d: \n",i+1);
            for(int j = 0;j<a.length;j++) {
                m[a[j]].showInfor();
                System.out.print("\n");
            }
            for(int j=0;j<b.length;j++) {
                n[b[j]].showInfor();
                System.out.print("\n");
            }
            
        }
        
    }
}
