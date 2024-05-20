/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
import java.lang.Math;
public class phanSo {
    Scanner sc = new Scanner(System.in);
    int tu, mau;
    
    void input()
    {
        this.tu = sc.nextInt();
        this.mau = sc.nextInt();
    }
    
    void rutGon()
    {
       int a = tu;
       int b = mau;
       if(b > a)
       {
           int temp = a;
           a = b;
           b = temp;
       }
       int r;
       while(b > 0)
       {
           r = a % b;
           a = b;
           b = r;
       } 
       tu /= a;
       mau /= a;
    }
    
    void output()
    {
        System.out.println("Phan so la: " + tu +"/" + mau);
    }
    
    void nghichDao()
    {
        int temp = tu;
        tu = mau;
        mau = temp;
    }
}


