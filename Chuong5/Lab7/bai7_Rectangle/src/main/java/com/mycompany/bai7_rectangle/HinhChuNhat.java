/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai7_rectangle;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class HinhChuNhat {

   double cd;
   double cr;

    public HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }
   
   public HinhChuNhat(){
       
   }
   
   public void input(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap chieu dai:");
       cd = sc.nextDouble();
       System.out.println("Nhap chieu rong");
       cr = sc.nextDouble();      
   }
   
   public void output(){
       System.out.println("=========================");
       System.out.println("Chieu dai la:" +cd);
       System.out.println("Chieu rong la:" +cr);
       System.out.println("Chu vi hinh chu nhat la: " +chuVi());
       System.out.println("Dien tich hinh chu nhat la:" +dienTich());
       System.out.println("=========================");
   }
   
   public double chuVi(){
       double cv=(cd+cr)*2;
       return cv;
   }
   
   public double dienTich(){
       double dt = cd*cr;
       return dt;
   }
}
